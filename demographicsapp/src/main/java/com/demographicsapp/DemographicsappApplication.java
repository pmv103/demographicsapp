package com.demographicsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Spring boot start point
 * @author PMV
 *
 */
@SpringBootApplication
public class DemographicsappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemographicsappApplication.class, args);
	}
	
	/**
	 * Configuring the Rest Template object
	 * @return
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}	

}
