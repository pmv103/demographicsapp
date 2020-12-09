package com.demographicsapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * WeatherExceptionController Handling exceptions and errors in API
 * To handle exception globally
 * @author PMV
 *
 */
@ControllerAdvice
public class WeatherExceptionController {
	
	@ExceptionHandler(value = WeatherNotFoundException.class)
	public ResponseEntity<Object> exception(WeatherNotFoundException exception) {
	      return new ResponseEntity<>("Current weather details not found", HttpStatus.NOT_FOUND);
	   }

}
