package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Aadhar;
import com.service.AadharService;

@RestController
@RequestMapping("aadhar")
@CrossOrigin
public class AadharController {
	
	@Autowired
	AadharService aadharService;
	
	@PostMapping(value = "createAadhar",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAadhar(@RequestBody Aadhar aadhar) {
		return aadharService.createAadhar(aadhar);
	}
	
	@PatchMapping(value = "updateAadhar",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateAadhar(@RequestBody Aadhar aadhar) {
		return aadharService.updateAadhar(aadhar);
	}
	
	@GetMapping(value="findAllAadhar",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Aadhar> getAllAadhar() {
		return aadharService.getAllAadhars();
	}
	
	
	
	@GetMapping(value="findAllAadhar/{aadharno}")
	public String findAadharById(@PathVariable("aadharno") int aadharno) {
		return aadharService.findAadharById(aadharno);
	}
	
	@DeleteMapping(value="deleteAadhar/{aadharno}")
	public String deleteAadharUsingId(@PathVariable("aadharno") int aadharno) {
		return aadharService.deleteAadhar(aadharno);
	}

}
