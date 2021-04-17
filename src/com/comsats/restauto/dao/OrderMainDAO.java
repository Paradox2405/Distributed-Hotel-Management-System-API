package com.comsats.restauto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.comsats.restauto.entity.Dish;
import com.comsats.restauto.entity.MainOrder;

public class OrderMainDAO extends GenericDAO {
public MainOrder allOrders = new MainOrder();
public Dish allOrderDetails = new Dish();
	
	String query;
	ResultSet resultSet = null;
	Connection dbConn = null;
	Statement sqlStmt = null;
	
	
	public ArrayList<MainOrder> getAllOrders(String customerID)
	{
			query = "select * from order_main INNER JOIN order_bill ON order_main.id = order_bill.order_id where order_main.customer_id='"+customerID+"' ORDER BY order_main.id desc";
		
		try {
			dbConn = this.getDbConnection();
			sqlStmt = dbConn.createStatement();
			resultSet = sqlStmt.executeQuery(query);
			while(resultSet != null && resultSet.next()) {
				
allOrders.list.add(new MainOrder(resultSet.getInt("order_main.id"),resultSet.getString("order_main.order_datetime"), resultSet.getFloat("order_bill.bill_amount")));
				
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
		return allOrders.getList();
	}
	
	public ArrayList<MainOrder> getCurrentOrders(String customerID)
	{
			query = "select * from order_main where customer_id ='"+customerID+"' and STATUS != 'billed' and STATUS != 'cancelled' ORDER BY order_main.id desc";
		
		try {
			dbConn = this.getDbConnection();
			sqlStmt = dbConn.createStatement();
			resultSet = sqlStmt.executeQuery(query);
			while(resultSet != null && resultSet.next()) {
				
allOrders.list.add(new MainOrder(resultSet.getInt("id")));
				
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
		return allOrders.getList();
	}
	
	public ArrayList<Dish> getAllOrdersDetails(Integer order_ID)
	{
			query = "SELECT * FROM order_detail INNER JOIN dish ON order_detail.dish_id = dish.id WHERE order_detail.order_id='"+order_ID+"'";
		
		try {
			dbConn = this.getDbConnection();
			sqlStmt = dbConn.createStatement();
			resultSet = sqlStmt.executeQuery(query);
			while(resultSet != null && resultSet.next()) {
				
				allOrderDetails.list.add(new Dish(resultSet.getString("dish.Name"),resultSet.getString("dish.price"), resultSet.getString("order_detail.quantity")));
				
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
		return allOrderDetails.getList();
	}
	
	
	
	
	
	
}
