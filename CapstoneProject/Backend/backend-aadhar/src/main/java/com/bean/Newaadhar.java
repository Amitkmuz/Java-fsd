package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Newaadhar {
	
	@Id
	private int aadharno;
	private String reason;
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Newaadhar [aadharno=" + aadharno + ", reason=" + reason + "]";
	}
	

}
