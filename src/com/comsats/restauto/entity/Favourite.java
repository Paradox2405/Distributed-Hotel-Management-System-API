package com.comsats.restauto.entity;

import java.util.ArrayList;

public class Favourite {

	public ArrayList<Favourite> list = new ArrayList<Favourite>();
	int dishID;

	public Favourite()
	{
		
	}
		
	public Favourite(int dishID)
	{
		setDishID(dishID);
	}
	
	public int getDishID() {
		return dishID;
	}

	public void setDishID(int dishID) {
		this.dishID = dishID;
	}

	public ArrayList<Favourite> getList() {
		return list;
	}

	public void setList(ArrayList<Favourite> list) {
		this.list = list;
	}
	
	
}
