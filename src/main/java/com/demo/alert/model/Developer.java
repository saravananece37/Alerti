package com.demo.alert.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class Developer {
	
	private String devName;
	
	private String mobileNumber;
	
	private int teamID;
	
	

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getTeamID() {
		return teamID;
	}

	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}
	
	
	


}
