package com.comsats.restauto.entity;

import java.util.ArrayList;

public class Dish {
	Integer dishID;
	int dishCategory;
	String dishName;
	String dishDescription;
	String dishPrice;
	String dishCalories;
	String dishDiscount;
	String dishCookTime;
	String dishImage;
	String dishUnit;
	String dishStatus;
	String dishQuantity;
	public ArrayList<Dish> list = new ArrayList<Dish>();
	
	public Dish(){
		
	}
	
public Dish(String dishName, String dishPrice, String dishQuantity){
		setDishName(dishName);
		setDishPrice(dishPrice);
		setDishQuantity(dishQuantity);
	}
	
	public Dish(Integer dishID, int dishCategory, String dishName,
			String dishDescription, String dishPrice, String dishCalories,
			String dishDiscount, String dishCookTime, String dishImage, String dishUnit,
			String dishStatus) {
		this.dishID = dishID;
		this.dishCategory = dishCategory;
		this.dishName = dishName;
		this.dishDescription = dishDescription;
		this.dishPrice = dishPrice;
		this.dishCalories = dishCalories;
		this.dishDiscount = dishDiscount;
		this.dishCookTime = dishCookTime;
		this.dishImage = dishImage;
		this.dishUnit = dishUnit;
		this.dishStatus = dishStatus;
	}

	public Integer getDishID() {
		return dishID;
	}
	public void setDishID(int dishID) {
		this.dishID = dishID;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getDishImage() {
		return dishImage;
	}
	public void setDishImage(String dishImage) {
		this.dishImage = dishImage;
	}
	public int getDishCategory() {
		return dishCategory;
	}
	public void setDishCategory(int dishCategory) {
		this.dishCategory = dishCategory;
	}
	public String getDishDescription() {
		return dishDescription;
	}
	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}
	public String getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(String dishPrice) {
		this.dishPrice = dishPrice;
	}
	public String getDishCalories() {
		return dishCalories;
	}
	public void setDishCalories(String dishCalories) {
		this.dishCalories = dishCalories;
	}
	public String getDishDiscount() {
		return dishDiscount;
	}
	public void setDishDiscount(String dishDiscount) {
		this.dishDiscount = dishDiscount;
	}
	public String getDishCookTime() {
		return dishCookTime;
	}
	public void setDishCookTime(String dishCookTime) {
		this.dishCookTime = dishCookTime;
	}
	public String getDishStatus() {
		return dishStatus;
	}
	public void setDishStatus(String dishStatus) {
		this.dishStatus = dishStatus;
	}
	public ArrayList<Dish> getList() {
		return list;
	}

	public void setList(ArrayList<Dish> list) {
		this.list = list;
	}

	public String getDishUnit() {
		return dishUnit;
	}

	public void setDishUnit(String dishUnit) {
		this.dishUnit = dishUnit;
	}

	public String getDishQuantity() {
		return dishQuantity;
	}

	public void setDishQuantity(String dishQuantity) {
		this.dishQuantity = dishQuantity;
	}

	

}
