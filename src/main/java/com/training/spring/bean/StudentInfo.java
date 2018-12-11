package com.training.spring.bean;

import java.math.BigInteger;

public class StudentInfo {

	private String name;
	private String branch;
	private String emailId;
	private int rollNo;
	private BigInteger mobileNo;
	
	public StudentInfo() {
		
	}

	public StudentInfo(String name, String branch, String emailId, int rollNo, BigInteger mobileNo) {
		super();
		this.name = name;
		this.branch = branch;
		this.emailId = emailId;
		this.rollNo = rollNo;
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public BigInteger getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(BigInteger mobileNo) {
		this.mobileNo = mobileNo;
	}

}
