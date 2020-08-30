package com.aerospike.client.rest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class FilghtsUploader {

	private static final String TEST_FILE = "src/test/resources/flights_from.csv";

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void upload() {
        RestTemplate template = new RestTemplate();
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
        parts.add("name", TEST_FILE);
        parts.add("file", new FileSystemResource(TEST_FILE));
        String response = template.postForObject("http://localhost:8080/uploadFlights", parts, String.class);
        System.out.println(response);
	}
}
