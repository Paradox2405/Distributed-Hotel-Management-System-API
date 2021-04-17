package com.comsats.restauto.entity;

import java.util.ArrayList;

public class Feedback {
	Integer feedbackID;
	String customerID;
	String feedbackRemarks;
	String feedbackRatig;
	String feedbackDate;
	String status;
	public ArrayList<Feedback> list = new ArrayList<Feedback>();
	
	public Feedback()
	{
		
	}
	
	public Feedback(Integer feedbackID, String customerID, String feedbackRemarks, String feedbackRatig, String feedbackDate, String status)
	{
		setFeedbackID(feedbackID);
		setCustomerID(customerID);
		setFeedbackRemarks(feedbackRemarks);
		setFeedbackRatig(feedbackRatig);
		setFeedbackDate(feedbackDate);
		setStatus(status);
	}

	public Integer getFeedbackID() {
		return feedbackID;
	}

	public void setFeedbackID(Integer feedbackID) {
		this.feedbackID = feedbackID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getFeedbackRemarks() {
		return feedbackRemarks;
	}

	public void setFeedbackRemarks(String feedbackRemarks) {
		this.feedbackRemarks = feedbackRemarks;
	}

	public String getFeedbackRatig() {
		return feedbackRatig;
	}

	public void setFeedbackRatig(String feedbackRatig) {
		this.feedbackRatig = feedbackRatig;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<Feedback> getList() {
		return list;
	}

	public void setList(ArrayList<Feedback> list) {
		this.list = list;
	}

	public String getFeedbackDate() {
		return feedbackDate;
	}

	public void setFeedbackDate(String feedbackDate) {
		this.feedbackDate = feedbackDate;
	}
	
	
}
