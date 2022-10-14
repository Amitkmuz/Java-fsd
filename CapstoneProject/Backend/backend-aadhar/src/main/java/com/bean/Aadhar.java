package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aadhar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aadharno;
	private String name;
	private String fathersname;
	private long mobileno;
	private String address;
	private Date dob;
	private String url;
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathersname() {
		return fathersname;
	}
	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Aadhar [aadharno=" + aadharno + ", name=" + name + ", fathersname=" + fathersname + ", mobileno="
				+ mobileno + ", address=" + address + ", dob=" + dob + ", url=" + url + "]";
	}
	
	

}
