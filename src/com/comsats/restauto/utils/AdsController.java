package com.comsats.restauto.utils;

import java.util.ArrayList;
import java.util.List;

import com.comsats.restauto.dao.AdsDAO;
import com.comsats.restauto.dao.GenericDAO;
import com.comsats.restauto.entity.Ad;

public class AdsController {
	GenericDAO dbConnectionHandler;
	Ad newAd = new Ad();
	public AdsController() {
		dbConnectionHandler = new GenericDAO();
	}
	
	
	public List<Ad> getAdsList() {
		// get the complete listing of ads from the db.
		ArrayList<Ad> list;
		AdsDAO suggestList = new AdsDAO();
		list = suggestList.getSuggestions();
		return list;
	}
}
