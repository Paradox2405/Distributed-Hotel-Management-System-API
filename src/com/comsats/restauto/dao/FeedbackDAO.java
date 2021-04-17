package com.comsats.restauto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.comsats.restauto.entity.Feedback;


public class FeedbackDAO extends GenericDAO{
	public Feedback feedbackHistory = new Feedback();
	
	String query;
	ResultSet resultSet = null;
	Connection dbConn = null;
	Statement sqlStmt = null;
	
	public ArrayList<Feedback> getFeedbackHistory(String customerID)
	{
		
			query = "select * from feedback_remarks where customer_id='"+customerID+"' ORDER BY id desc";	
		
		try {
			dbConn = this.getDbConnection();
			sqlStmt = dbConn.createStatement();
			resultSet = sqlStmt.executeQuery(query);
			while(resultSet != null && resultSet.next()) {
				
				//System.out.println(count++ +" = "+resultSet.getString("NAME"));	
feedbackHistory.list.add(new Feedback(resultSet.getInt("id"),resultSet.getString("customer_id"),resultSet.getString("remarks"),resultSet.getString("rating"),resultSet.getString("created_on"),resultSet.getString("STATUS")));
//System.out.print(suggestion.list.get(count++).getCatName());
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (sqlStmt != null) {
					sqlStmt.close();
				}
				if (dbConn != null) {
					dbConn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return feedbackHistory.getList();
	}
}
