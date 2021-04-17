package com.comsats.restauto.utils;

import java.util.ArrayList;

import com.comsats.restauto.dao.DishDAO;
import com.comsats.restauto.entity.Dish;

public class DishController {
	
	public ArrayList<Dish> getAllDishes(int id) {
		ArrayList<Dish> list;
		DishDAO listSuggest = new DishDAO();
		list =  listSuggest.getSuggestions(id);
		return  list;
	}
	public ArrayList<Dish> getAllHotDishes() {
		ArrayList<Dish> list;
		DishDAO listSuggest = new DishDAO();
		list =  listSuggest.getHotSuggestions();
		return  list;
	}
	public Dish getAllFavDishes(int dishID) {
		Dish obj;
		DishDAO listSuggest = new DishDAO();
		obj =  listSuggest.getFavSuggestions(dishID);
		return  obj;
	}
	public ArrayList<Dish> getAllMostOrder(String customerID) {
		ArrayList<Dish> list;
		DishDAO listSuggest = new DishDAO();
		list =  listSuggest.getMostOrderSuggestions(customerID);
		return  list;
	}

}
