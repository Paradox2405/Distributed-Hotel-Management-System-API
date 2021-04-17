package com.comsats.restauto.entity;

public class OrderDetail {
	
	int dishID;
	String dishQuantity;
	String orderTime;
	
	public int getDishID() {
		return dishID;
	}
	public void setDishID(int dishID) {
		this.dishID = dishID;
	}
	public String getDishQuantity() {
		return dishQuantity;
	}
	public void setDishQuantity(String dishQuantity) {
		this.dishQuantity = dishQuantity;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
	
	
}
