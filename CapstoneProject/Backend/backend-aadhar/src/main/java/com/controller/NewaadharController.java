package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Newaadhar;
import com.service.NewaadharService;

@RestController
@RequestMapping("newaadhar")
@CrossOrigin
public class NewaadharController {
	
	@Autowired
	NewaadharService newaadharService;
	
	@PostMapping(value = "storeNewaadhar",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeNewaadhar(@RequestBody Newaadhar newaadhar) {
		return newaadharService.storeNewaadhar(newaadhar);
	}
	
	@GetMapping(value="findAllNewaadhar",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Newaadhar> getAllNewaadhar() {
		return newaadharService.getAllNewaadhars();
	}

}
