package com.demographicsapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author PMV
 * Service class to serve current weather details *
 */
@Service
public class CurrentWeatherService {

	@Autowired
	private RestTemplate restTemplate;
	
	//Injecting properties
	@Value("${accessKey}")
	private String accessKey;
	@Value("${currentWeatherUrl}")
	private String currentWeatherUrl;

	public String getCurrentWeather(String query) {		
		String currentWatherResourceUrl = currentWeatherUrl + "?" + "access_key=" + accessKey + "&query=" + query + "";		
		return restTemplate.getForEntity(currentWatherResourceUrl, String.class).getBody().toString();
	}

}
