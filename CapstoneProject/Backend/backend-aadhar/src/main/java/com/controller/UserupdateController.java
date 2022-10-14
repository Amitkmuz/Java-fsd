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

import com.bean.Userupdate;
import com.service.UserupdateService;



@RestController
@RequestMapping("userupdate")
@CrossOrigin
public class UserupdateController {
	
	@Autowired
	UserupdateService userupdateService;
	
	@PostMapping(value = "storeUserupdate",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeUserupdate(@RequestBody Userupdate userupdate) {
		return userupdateService.storeUserupdate(userupdate);
	}
	
	@GetMapping(value="findAllUserupdate",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Userupdate> getAllUserupdate() {
		return userupdateService.getAllUserupdates();
	}

}
