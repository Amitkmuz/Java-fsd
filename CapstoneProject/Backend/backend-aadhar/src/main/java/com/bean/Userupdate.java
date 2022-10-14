package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Userupdate {
	
	@Id
	private int aadharno;
	private String address;
	private long phone;
	private Date dob;
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Userupdate [aadharno=" + aadharno + ", address=" + address + ", phone=" + phone + ", dob=" + dob + "]";
	}
	

}
