package com.comsats.restauto.entity;

import java.util.ArrayList;

public class MainOrder {

	int ID;
	String customerID;
	int tableNo;
	String specialInstructions;
	String actualTime;
	int estimatedTime;
	String orderTime;
	Float orderTotal;
	
	
	public ArrayList<MainOrder> list = new ArrayList<MainOrder>();
	
	public MainOrder(){
		
	}
public MainOrder(int ID){
		setID(ID);
	}
	public MainOrder(int ID, String orderDate, Float orderTotal)
	{
		setID(ID);
		setOrderTime(orderDate);
		setOrderTotal(orderTotal);
	}
	
	
	public ArrayList<MainOrder> getList() {
		return list;
	}
	public void setList(ArrayList<MainOrder> list) {
		this.list = list;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	public String getSpecialInstructions() {
		return specialInstructions;
	}
	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
	public String getActualTime() {
		return actualTime;
	}
	public void setActualTime(String actualTime) {
		this.actualTime = actualTime;
	}
	public int getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public Float getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(Float orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	
	
	
}
