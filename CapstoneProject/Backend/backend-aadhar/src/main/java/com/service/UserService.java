package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bean.User;
import com.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public String applyAadhar(User user) {
		Optional<User> result = userRepository.findById(user.getEmail());
		if(result.isPresent()) {
					return "Email Id alreay exists";
		}else {
				userRepository.save(user);
				return "Aadhar Apply successfully";
			}
			
		}
	
	public String findUserById(String email) {
		Optional<User> result = userRepository.findById(email);
		if(result.isPresent()) {
			User p = result.get();
			return p.toString();
		}else {
			return "Status  not present";
		}	
	}
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	public String updateUser(User user) {
		Optional<User> result  = userRepository.findById(user.getEmail());
		if(result.isPresent()) {
			User p = result.get();
			p.setStatus(user.getStatus());
			p.setUadhno(user.getUadhno());
			userRepository.saveAndFlush(p);
			return "Data add successfully";
		}else {
			return "Data not present";
		}
	}
}


