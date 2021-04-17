package com.comsats.restauto.utils;

import java.util.ArrayList;

import com.comsats.restauto.dao.FeedbackDAO;
import com.comsats.restauto.entity.Feedback;

public class FeedbackController {
	FeedbackDAO feedbackDAO;
	
	public FeedbackController()
	{
		feedbackDAO = new FeedbackDAO();
	}
	public ArrayList<Feedback> getFeedbackList(String customerID)
	{
		ArrayList<Feedback> list;
		FeedbackDAO feedbackList = new FeedbackDAO();
		list = feedbackList.getFeedbackHistory(customerID);
		return list;
		
	}
	public void postFeedback(Feedback newFeedback)
	{
		String updateQuery = "insert into feedback_remarks (customer_id,remarks,rating,created_on,STATUS) values('"+newFeedback.getCustomerID()+"','"+newFeedback.getFeedbackRemarks()+"','"+Integer.parseInt(String.valueOf(Math.round(Float.parseFloat(newFeedback.getFeedbackRatig()))))*20+"','"+newFeedback.getFeedbackDate()+"','"+newFeedback.getStatus()+"')";
		feedbackDAO.executeUpdate(updateQuery);
	}
}
