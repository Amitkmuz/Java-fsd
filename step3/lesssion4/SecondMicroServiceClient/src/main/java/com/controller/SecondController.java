package com.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
	
	@RequestMapping(value="secondClient")
	public String sayHello() {
		return "Welcomr to Spring Boot with Second micro service client";
	}

}
