package com.service.randomservice.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.randomservice.service.Configuration;

@RestController
public class RandomController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/number")
	public Integer getRandom() {
		 Random rand = new Random();
         return rand.nextInt(configuration.getNumber());
	}

}
