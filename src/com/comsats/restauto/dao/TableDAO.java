package com.comsats.restauto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.comsats.restauto.entity.Table;

public class TableDAO extends GenericDAO {

	public Table suggestion = new Table();
	
	String query;
	ResultSet resultSet = null;
	Connection dbConn = null;
	Statement sqlStmt = null;
	public ArrayList<Table> getSuggestionsList()
	{
		
			query = "select id,number,description,STATUS from table_info";	
		
		try {
			dbConn = this.getDbConnection();
			sqlStmt = dbConn.createStatement();
			resultSet = sqlStmt.executeQuery(query);
			while(resultSet != null && resultSet.next()) {
				
				//System.out.println(count++ +" = "+resultSet.getString("NAME"));	
suggestion.list.add(new Table(resultSet.getInt("id"),resultSet.getInt("number"),resultSet.getString("description"),resultSet.getString("STATUS")));
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
		return suggestion.getList();
	}
	
	
	
}
