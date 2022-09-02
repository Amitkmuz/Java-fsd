package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Feedback;
import com.dao.FeedbackDao;

@Service
public class FeedbackService {
	
	@Autowired
	FeedbackDao feedbackDao;
	
	public String storeFeedback(Feedback fee) {
		if(feedbackDao.storeFeedback(fee)>0) {
			return "Record stored";
		}else {
			return "Record not stored";
		}
	}

}
