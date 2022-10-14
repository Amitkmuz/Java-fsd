package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Aadhar;
import com.repository.AadharRepository;

@Service
public class AadharService {
	@Autowired
	AadharRepository aadharRepository;
	
	public String createAadhar(Aadhar aadhar) {
		aadharRepository.save(aadhar);
		return "Aadhar Card Created Successfully";
	}
	
	public List<Aadhar> getAllAadhars() {
		return aadharRepository.findAll();
	}
	
	public String findAadharById(int aadharno) {
		Optional<Aadhar> result  = aadharRepository.findById(aadharno);
		if(result.isPresent()) {
			Aadhar p = result.get();
			return p.toString();
		}else {
			return "Aadhar  not present";
		}
	}
	
	
	public String deleteAadhar(int aadharno) {
		Optional<Aadhar> result  = aadharRepository.findById(aadharno);
		if(result.isPresent()) {
			Aadhar p = result.get();
			aadharRepository.delete(p);
			return "Aadhar Card deleted successfully";
		}else {
			return "Aadhar  not present";
		}
	}
	
	public String updateAadhar(Aadhar aadhar) {
		Optional<Aadhar> result  = aadharRepository.findById(aadhar.getAadharno());
		if(result.isPresent()) {
			Aadhar p = result.get();
			p.setAddress(aadhar.getAddress());
			p.setMobileno(aadhar.getMobileno());
			p.setDob(aadhar.getDob());
			aadharRepository.saveAndFlush(p);
			return "Aadhar Card updated successfully";
		}else {
			return "Aadhar not present";
		}
	}

}
