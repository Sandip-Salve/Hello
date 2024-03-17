package com.app.PrcDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public ResponseEntity<String> getStarted(){
		return new ResponseEntity<String> ("Hello, Good Morning.",HttpStatus.OK);
	}
}
