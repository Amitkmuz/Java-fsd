package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Userupdate;
import com.repository.UserupdateRepository;

@Service
public class UserupdateService {
	
	@Autowired
	UserupdateRepository userupdateRepository;
	
	public String storeUserupdate(Userupdate userupdate) {
		userupdateRepository.save(userupdate);
		return "User Details Submitted Successfully";
	}
	
	public List<Userupdate> getAllUserupdates() {
		return userupdateRepository.findAll();
	}

}
