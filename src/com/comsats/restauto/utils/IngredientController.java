package com.comsats.restauto.utils;

import com.comsats.restauto.dao.IngredientDAO;

public class IngredientController {

	public String getAllIngredients(int id) {
		String list;
		IngredientDAO listSuggest = new IngredientDAO();
		list =  listSuggest.getSuggestions(id);
		return  list;
	}
}
