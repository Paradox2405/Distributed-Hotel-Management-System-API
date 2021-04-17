package com.comsats.restauto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.comsats.restauto.entity.Dish;


public class DishDAO extends GenericDAO {
	public Dish suggestion = new Dish();
	
	String query;
	ResultSet resultSet = null;
	Connection dbConn = null;
	Statement sqlStmt = null;
	
	public ArrayList<Dish> getSuggestions(int id) {
		
		query = "SELECT  d.* FROM dish d LEFT OUTER JOIN order_detail od ON (d.id = od.dish_id AND od.status='true') "+
				"WHERE category_id= '"+id+"' and d.STATUS = 'enabled'"+
				"GROUP BY d.id " +
				"ORDER BY COUNT(DISTINCT od.id) DESC , d.id ASC";
		//query = "select * from dish where category_id = " + id;	
		
		try {
			dbConn = this.getDbConnection();
			sqlStmt = dbConn.createStatement();
			resultSet = sqlStmt.executeQuery(query);
			while(resultSet != null && resultSet.next()) {
				
				//System.out.println(count++ +" = "+resultSet.getString("NAME"));	
suggestion.list.add(new Dish(resultSet.getInt("id"),
		resultSet.getInt("category_id"),
		resultSet.getString("NAME"),
		resultSet.getString("description"),
		resultSet.getString("price"),
		resultSet.getString("calories_per_100_grams"),
		resultSet.getString("discount"),
		resultSet.getString("average_cooking_time_min"),
		resultSet.getString("picture"),
		resultSet.getString("unit"),
		resultSet.getString("STATUS")));
				
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

public ArrayList<Dish> getHotSuggestions() {
		
		query = "select * from dish where hot = 'Yes' and STATUS = 'enabled'";	
		
		try {
			dbConn = this.getDbConnection();
			sqlStmt = dbConn.createStatement();
			resultSet = sqlStmt.executeQuery(query);
			while(resultSet != null && resultSet.next()) {
				
				//System.out.println(count++ +" = "+resultSet.getString("NAME"));	
suggestion.list.add(new Dish(resultSet.getInt("id"),
		resultSet.getInt("category_id"),
		resultSet.getString("NAME"),
		resultSet.getString("description"),
		resultSet.getString("price"),
		resultSet.getString("calories_per_100_grams"),
		resultSet.getString("discount"),
		resultSet.getString("average_cooking_time_min"),
		resultSet.getString("picture"),
		resultSet.getString("unit"),
		resultSet.getString("STATUS")));
				
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

public Dish getFavSuggestions(int dishId) {
	
	query = "select * from dish where id="+dishId+" and STATUS = 'enabled'";	
	
	try {
		dbConn = this.getDbConnection();
		sqlStmt = dbConn.createStatement();
		resultSet = sqlStmt.executeQuery(query);
		while(resultSet != null && resultSet.next()) {
			
			//System.out.println(count++ +" = "+resultSet.getString("NAME"));	
			suggestion.setDishID(resultSet.getInt("id"));
			suggestion.setDishCategory(resultSet.getInt("category_id"));
			suggestion.setDishName(resultSet.getString("NAME"));		
			suggestion.setDishDescription(resultSet.getString("description"));
			suggestion.setDishPrice(resultSet.getString("price"));
			suggestion.setDishCalories(resultSet.getString("calories_per_100_grams"));
			suggestion.setDishDiscount(resultSet.getString("discount"));
			suggestion.setDishCookTime(resultSet.getString("average_cooking_time_min"));
			suggestion.setDishImage(resultSet.getString("picture"));
			suggestion.setDishUnit(resultSet.getString("unit"));
			suggestion.setDishStatus(resultSet.getString("STATUS"));			
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
	return suggestion;
}

public ArrayList<Dish> getMostOrderSuggestions(String customerID) {
	
	query = "SELECT  d.* FROM dish d ,order_detail od, order_main om "+ 
			"WHERE d.id = od.dish_id AND om.status='billed' AND od.order_id=om.id AND d.STATUS = 'enabled' AND "+
			"om.customer_id='"+customerID+"' "+
			"GROUP BY d.id " +
			"ORDER BY SUM(od.quantity) DESC";
	
	try {
		dbConn = this.getDbConnection();
		sqlStmt = dbConn.createStatement();
		resultSet = sqlStmt.executeQuery(query);
		while(resultSet != null && resultSet.next()) {
			
			//System.out.println(count++ +" = "+resultSet.getString("NAME"));	
suggestion.list.add(new Dish(resultSet.getInt("id"),
	resultSet.getInt("category_id"),
	resultSet.getString("NAME"),
	resultSet.getString("description"),
	resultSet.getString("price"),
	resultSet.getString("calories_per_100_grams"),
	resultSet.getString("discount"),
	resultSet.getString("average_cooking_time_min"),
	resultSet.getString("picture"),
	resultSet.getString("unit"),
	resultSet.getString("STATUS")));
			
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
