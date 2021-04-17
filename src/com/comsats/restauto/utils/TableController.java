package com.comsats.restauto.utils;

import java.util.ArrayList;

import com.comsats.restauto.dao.GenericDAO;
import com.comsats.restauto.dao.TableDAO;
import com.comsats.restauto.entity.Table;

public class TableController {
	GenericDAO dbConnectionHandler;
	
	public TableController()
	{
		dbConnectionHandler = new GenericDAO();
	}
	
	
	public ArrayList<Table> suggestTable()
	{
		ArrayList<Table> list;
		TableDAO tablesuggest = new TableDAO();
		list = tablesuggest.getSuggestionsList();
		return list;
		
	}
	
}
