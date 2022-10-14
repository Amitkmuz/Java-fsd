package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.User;
import com.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "applyAadhar",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String applyAadhar(@RequestBody User user) {
		System.out.println(user);
		return userService.applyAadhar(user);
	}
	
	@GetMapping(value="findUserById/{email}")
	public String findUserById(@PathVariable("email") String email) {
		return userService.findUserById(email);
	}
	
	@PatchMapping(value = "updateUser",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@GetMapping(value="findAllUser",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllProduct() {
		return userService.getAllUsers();
	}

}
