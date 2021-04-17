package com.comsats.restauto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TaxDAO extends GenericDAO{
		
	String query;
	ResultSet resultSet = null;
	Connection dbConn = null;
	Statement sqlStmt = null;
	
	public String checkTAX()
	{
		String query = "select * from tax";
		
		String tax = "";
		try {
			dbConn = this.getDbConnection();
			sqlStmt = dbConn.createStatement();
			resultSet = sqlStmt.executeQuery(query);
			
			if(resultSet != null && resultSet.next())
			{
				tax = String.valueOf(resultSet.getInt(2));
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
		return tax;
	}

}
