package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.bean.User;
import com.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "searchUser",method = RequestMethod.GET)
	public ModelAndView searchUser(HttpServletRequest req) {
		int uid = Integer.parseInt(req.getParameter("uid"));
		
		String result = userService.searchUserById(uid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("index.jsp");
		return mav;
	}
	
	@RequestMapping(value = "updateUser",method = RequestMethod.POST)
	public ModelAndView updateUser(HttpServletRequest req, User user) {
		int uid = Integer.parseInt(req.getParameter("uid"));
		String uname=req.getParameter("uname");
		int uage = Integer.parseInt(req.getParameter("uage"));
		
		user.setUid(uid);
		user.setUname(uname);
		user.setUage(uage);
		
		String result = userService.updateUser(user);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("updateUser.jsp");
		return mav;
	}

}
