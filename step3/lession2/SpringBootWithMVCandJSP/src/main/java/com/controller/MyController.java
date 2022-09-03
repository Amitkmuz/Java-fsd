package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String penIndexpage() {
		System.out.println("I came Here");
		return "index";
	}
	
	@RequestMapping(value="checkUser",method=RequestMethod.POST)
	public String checkUserDetails(HttpServletRequest req) {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(email.contentEquals("amit@gmail.com")&& password.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
		
	}

}
