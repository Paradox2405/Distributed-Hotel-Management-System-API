package com.comsats.restauto.entity;

public class CallWaiter {
	Integer callID;
	String customerID;
	int callTableNo;
	String callDateTime;
	String callStatus;
	
	public Integer getCallID() {
		return callID;
	}
	public void setCallID(Integer callID) {
		this.callID = callID;
	}
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public int getCalltableNo() {
		return callTableNo;
	}
	
	public void setCalltableNo(int calltableNo) {
		this.callTableNo = calltableNo;
	}
	public String getCallDateTime() {
		return callDateTime;
	}
	public void setCallDateTime(String callDateTime) {
		this.callDateTime = callDateTime;
	}
	public String getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(String callStatus) {
		this.callStatus = callStatus;
	}

	
}
