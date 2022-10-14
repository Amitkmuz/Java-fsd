package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class User {
	
	@Id
	private String email;
	private String uname;
	private String fname;
	private String address;
	private long phone;
	private Date dob;
	private String status;
	private int uadhno;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getUadhno() {
		return uadhno;
	}
	public void setUadhno(int uadhno) {
		this.uadhno = uadhno;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", uname=" + uname + ", fname=" + fname + ", address=" + address + ", phone="
				+ phone + ", dob=" + dob + ", status=" + status + ", uadhno=" + uadhno + "]";
	}
	

}
