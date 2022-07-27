package io.vishal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

	@GetMapping("/test")
	public ResponseEntity<String> test(){
		log.info("inside test controller test method");
		return ResponseEntity.ok("working");
	}
}
