package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Newaadhar;
import com.repository.NewaadharRepository;

@Service
public class NewaadharService {
	
	@Autowired
	NewaadharRepository newaadharRepository;
	
	public String storeNewaadhar(Newaadhar newaadhar) {
		newaadharRepository.save(newaadhar);
		return "Duplicate Aadhar Card Applied Successfully";
	}
	
	public List<Newaadhar> getAllNewaadhars() {
		return newaadharRepository.findAll();
	}

}
