package com.demographicsapp.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demographicsapp.exception.WeatherNotFoundException;
import com.demographicsapp.service.CurrentWeatherService;

/**
 * DemographicsAppResource which act as rest controller
 * @author PMV
 * 
 */

@RestController
public class DemographicsAppResource {

	@Autowired
	private CurrentWeatherService currentWeatherService;

	@GetMapping(value = "/currentWeather/{query}", produces = "application/json")
	public ResponseEntity<Object> getCurrentWeather(@PathVariable("query") String query) throws WeatherNotFoundException {
		return new ResponseEntity<>(currentWeatherService.getCurrentWeather(query), HttpStatus.OK);
	}

}
