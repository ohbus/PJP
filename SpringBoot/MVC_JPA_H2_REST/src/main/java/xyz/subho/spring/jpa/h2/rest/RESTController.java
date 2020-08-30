/* 
 * Copyright 2012-2015 Aerospike, Inc.
 *
 * Portions may be licensed to Aerospike, Inc. under one or more contributor
 * license agreements.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package xyz.subho.spring.jpa.h2.rest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Bin;
import com.aerospike.client.Info;
import com.aerospike.client.Key;
import com.aerospike.client.Language;
import com.aerospike.client.Record;
import com.aerospike.client.Value;
import com.aerospike.client.cluster.Node;
import com.aerospike.client.policy.Policy;
import com.aerospike.client.policy.QueryPolicy;
import com.aerospike.client.policy.WritePolicy;
import com.aerospike.client.query.Filter;
import com.aerospike.client.query.IndexType;
import com.aerospike.client.query.KeyRecord;
import com.aerospike.client.query.ResultSet;
import com.aerospike.client.query.Statement;
import com.aerospike.client.task.IndexTask;
import com.aerospike.client.task.RegisterTask;

@Controller
public class RESTController {
	private static Logger log = Logger.getLogger(RESTController.class); 
	
	@Autowired
	AerospikeClient client;
	
	boolean dateIndexCreated = false;
	boolean flightPackageRefistered = false;

	/**
	 * get a specific flight record via primary key
	 * @param namespace
	 * @param set
	 * @param keyvalue
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/as/{namespace}/{set}/getAll/{key}", method=RequestMethod.GET)
	public @ResponseBody JSONRecord getAll(@PathVariable("namespace") String namespace, @PathVariable("set") String set, @PathVariable("key") String keyvalue) throws Exception {

		Policy policy = new Policy();
		Key key = new Key(namespace, set, Value.get(keyvalue));
		Record record = client.get(policy, key);
		KeyRecord result = new KeyRecord(key, record);

		return new JSONRecord(record);
	}
	/**
	 * Query and filter by airport date and time
	 * This method assumes a secondary index on "FL_DATE" 
	 * has already been created, and the package "flight-package.lua"
	 * has been registered
	 * @param namespace
	 * @param set
	 * @param origin
	 * @param date
	 * @param start
	 * @param stop
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/as/{namespace}/{set}/departFrom/{origin}/on/{date}/between/{start}/and/{stop}", method=RequestMethod.GET)
	public @ResponseBody JSONResultSet departFrom(@PathVariable("namespace") String namespace, 
			@PathVariable("set") String set, @PathVariable("origin") String origin,
			@PathVariable("date") String date, @PathVariable("start") String start, @PathVariable("stop") String stop) throws Exception {

		/*
		 * create the data index once
		 */
		if (!dateIndexCreated){
			/*
			 * check if the index is created
			 */
			Node[] nodes = client.getNodes();
			String infoResult = Info.request(nodes[0], "sindex");
			/*
			 * create if not found
			 */
			if (!infoResult.contains("flight_date_index")){
				log.debug("The index: flight_date_index has not been created, creating now...");
				IndexTask task = this.client.createIndex(null, namespace, set, "flight_date_index", "FL_DATE", IndexType.STRING);
				task.waitTillComplete();
				log.debug("The index: flight_date_index created successfully");
			}
			dateIndexCreated = true;
		}
		/*
		 * register flight package once
		 */
		if (!flightPackageRefistered){
			/*
			 * check if UDF package is registered
			 */
			Node[] nodes = client.getNodes();
			String udfString = Info.request(nodes[0], "udf-list");
			
			if (!udfString.contains("flight-package")){
				log.debug("flight-package.lua is not regestered, registering now...");
				RegisterTask task = this.client.register(null, 
						"src/main/lua/flight-package.lua", 
						"flight-package.lua", 
						Language.LUA); 
				task.waitTillComplete();
				log.debug("flight-package.lua regesteration complete");
			}
			flightPackageRefistered = true;
		}

		// use date format 2012-07-04 in the URL 
		date = date.replace('-', '/'); // convert it to use format 2012/07/04 in the query 
		
		QueryPolicy policy = new QueryPolicy();
		Statement stmt = new Statement();
		stmt.setNamespace(namespace);
		stmt.setSetName(set);
		stmt.setFilters(Filter.equal("FL_DATE", date));
		ResultSet resultSet = client.queryAggregate(policy, stmt, "flight-package.lua", "origin_and_time", 
				Value.get(origin), Value.get(start), Value.get(stop));

		return new JSONResultSet(resultSet);
	}

	/*
	 * CSV flights file upload
	 */
	@RequestMapping(value="/uploadFlights", method=RequestMethod.GET)
	public @ResponseBody String provideUploadInfo() {
		return "You can upload a file by posting to this same URL.";
	}

	@RequestMapping(value="/uploadFlights", method=RequestMethod.POST)
	public @ResponseBody String handleFileUpload(@RequestParam("name") String name, 
			@RequestParam("file") MultipartFile file){

		if (!file.isEmpty()) {
			try {
				WritePolicy wp = new WritePolicy();
				String line =  "";
				BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()));
				while ((line = br.readLine()) != null) {

					// use comma as separator
					String[] flight = line.split(",");

					/*
					 * write the record to Aerospike
					 * NOTE: Bin names must not exceed 14 characters
					 */
					client.put(wp,
							new Key("test", "flights",flight[0].trim() ),
							new Bin("YEAR", Integer.parseInt(flight[1].trim())),	
							new Bin("DAY_OF_MONTH", Integer.parseInt(flight[2].trim())),
							new Bin("FL_DATE", flight[3].trim()),
							new Bin("AIRLINE_ID", Integer.parseInt(flight[4].trim())),	
							new Bin("CARRIER", flight[5].trim()),
							new Bin("FL_NUM", Integer.parseInt(flight[6].trim())),
							new Bin("ORI_AIRPORT_ID", Integer.parseInt(flight[7].trim())),
							new Bin("ORIGIN", flight[8].trim()),
							new Bin("ORI_CITY_NAME", flight[9].trim()),
							new Bin("ORI_STATE_ABR", flight[10].trim()),
							new Bin("DEST", flight[11].trim()),
							new Bin("DEST_CITY_NAME", flight[12].trim()),
							new Bin("DEST_STATE_ABR", flight[13].trim()),
							new Bin("DEP_TIME", Integer.parseInt(flight[14].trim())),
							new Bin("ARR_TIME", Integer.parseInt(flight[15].trim())),
							new Bin("ELAPSED_TIME", Integer.parseInt(flight[16].trim())),
							new Bin("AIR_TIME", Integer.parseInt(flight[17].trim())),
							new Bin("DISTANCE", Integer.parseInt(flight[18].trim()))
							);

					log.debug("Flight [ID= " + flight[0] 
							+ " , year=" + flight[1] 
									+ " , DAY_OF_MONTH=" + flight[2] 
											+ " , FL_DATE=" + flight[3] 
													+ " , AIRLINE_ID=" + flight[4] 
															+ " , CARRIER=" + flight[5] 
																	+ " , FL_NUM=" + flight[6] 
																			+ " , ORIGIN_AIRPORT_ID=" + flight[7] 
																					+ "]");

				}
				br.close();
				log.info("Successfully uploaded " + name);
				return "You successfully uploaded " + name;
			} catch (Exception e) {
				log.error("Failed to upload " + name, e);
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			log.info("Failed to upload " + name + " because the file was empty.");
			return "You failed to upload " + name + " because the file was empty.";
		}
	}

}
