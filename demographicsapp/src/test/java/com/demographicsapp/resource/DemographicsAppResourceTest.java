package com.demographicsapp.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;



@RunWith(SpringRunner.class)
public class DemographicsAppResourceTest {
	
	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void getCurrentWeather() {
		String query = "fdasdfsa";
		String currentWeatherUrl ="http://localhost:8080/currentWeather/";
		String accessKey = "dcd";
		String currentWatherResourceUrl = currentWeatherUrl + "?" + "access_key=" + accessKey + "&query=" + query + "";		
		System.out.println(restTemplate.getForEntity(currentWatherResourceUrl, String.class).getBody().toString());
		
	}
}
