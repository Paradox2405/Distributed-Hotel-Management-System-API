package com.comsats.restauto.utils;

import java.util.ArrayList;

import com.comsats.restauto.dao.CategoryDAO;
import com.comsats.restauto.entity.Category;

public class CategoryController {
	public ArrayList<Category> getAllCategories(String str) {
		ArrayList<Category> list;
		CategoryDAO listSuggest = new CategoryDAO();
		list =  listSuggest.getSuggestions(str);
		return  list;
	}
}
