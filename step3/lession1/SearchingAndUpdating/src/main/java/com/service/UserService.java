package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bean.User;
import com.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public String searchUserById(int uid) {
		User u = userDao.searchUserById(uid);
		if(u==null) {
			return "Record not present";
		}else {
			return u.toString();
		}
	}
	
	public String updateUser(User user) {
		if(userDao.updateUser(user)>0) {
			return "Record updated successfully";
		}else {
			return "Record didn't update";
		}
	}

}
