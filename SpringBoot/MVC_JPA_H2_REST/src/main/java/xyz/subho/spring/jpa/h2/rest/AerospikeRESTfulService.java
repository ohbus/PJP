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

import java.util.Properties;

import javax.servlet.MultipartConfigElement;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.AerospikeException;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class AerospikeRESTfulService {
	
	@Bean(destroyMethod="close")
	public AerospikeClient asClient() throws AerospikeException {
		Properties as = System.getProperties();
		return new AerospikeClient(as.getProperty("seedHost"), Integer.parseInt(as.getProperty("port")));
	}
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		return new MultipartConfigElement("");
	}
	
	
	
	public static void main(String[] args) throws ParseException {

		Options options = new Options();
		options.addOption("h", "host", true, "Server hostname (default: localhost)");
		options.addOption("p", "port", true, "Server port (default: 3000)");

		// parse the command line args
		CommandLineParser parser = new PosixParser();
		CommandLine cl = parser.parse(options, args, false);

		// set properties
		Properties as = System.getProperties();
		String host = cl.getOptionValue("h", "localhost");
		as.put("seedHost", host);
		String portString = cl.getOptionValue("p", "3000");
		as.put("port", portString);

		// start app
		SpringApplication.run(AerospikeRESTfulService.class, args);

	}

}
