package com.capg.otms.updateanddeletetest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.otms.updateanddeletetest.exception.TestNotFoundException;


@ControllerAdvice
@RestController

	
public class TestErrorController {
	
	

		@ExceptionHandler(TestNotFoundException.class)
		@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Test Not Found" , code = HttpStatus.NOT_FOUND)
		public void handleTestNotFoundException() {
			
		}
		
		@ExceptionHandler(Exception.class)
		@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid Data" , code = HttpStatus.BAD_REQUEST)
		public void handleException() {
			
		}
		
		
}
