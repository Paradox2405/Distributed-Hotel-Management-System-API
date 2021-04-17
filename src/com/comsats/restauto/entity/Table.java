package com.comsats.restauto.entity;

import java.util.ArrayList;

public class Table {
	Integer tableID;
	int tableNumber;
	String tableDescription;
	String status;
	public ArrayList<Table> list = new ArrayList<Table>();
	
	public Table()
	{
		
	}
	
	public Table(Integer tableID, int tableNumber, String tableDescription, String status)
	{
		setTableID(tableID);
		setTableNumber(tableNumber);
		setTableDescription(tableDescription);
		setStatus(status);
	}
	
	
	public Integer getTableID() {
		return tableID;
	}


	public void setTableID(Integer tableID) {
		this.tableID = tableID;
	}


	public ArrayList<Table> getList() {
		return list;
	}


	public void setList(ArrayList<Table> list) {
		this.list = list;
	}


	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public String getTableDescription() {
		return tableDescription;
	}
	public void setTableDescription(String tableDescription) {
		this.tableDescription = tableDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
