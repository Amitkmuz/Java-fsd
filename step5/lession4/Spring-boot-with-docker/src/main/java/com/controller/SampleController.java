package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping(value="/")
	public String greeeting() {
		return "Welcome to Spring boot with docker";
	}
	
	@GetMapping(value="say")
	public String sayHello(@PathVariable("name") String name) {
	return "welcome user"+name+"to Spring boot With docker";
	
	}

}
