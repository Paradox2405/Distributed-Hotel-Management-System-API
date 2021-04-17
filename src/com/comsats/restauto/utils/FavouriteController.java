package com.comsats.restauto.utils;

import java.util.ArrayList;

import com.comsats.restauto.dao.FavouriteDAO;
import com.comsats.restauto.dao.GenericDAO;
import com.comsats.restauto.entity.Favourite;

public class FavouriteController extends GenericDAO{
	GenericDAO dbConnectionHandler;
	
	public FavouriteController()
	{
		dbConnectionHandler = new GenericDAO();
	}
	public String checkFavouriteDish(int id, String customerID)
	{
		String result;
		FavouriteDAO favouriteDAO = new FavouriteDAO();
		if(favouriteDAO.checkFavourite(id,customerID) > 0)
		{
			result = "already";
		}
		else
		{
			result = "new";
		}
		
		return result;
	}
	public void addFavouriteDish(int id, String customerID)
	{
		String insertQuery = "insert into favourite_dishes (customer_id,dish_id) values('"+customerID+"','"+ id +"')";
		dbConnectionHandler.executeUpdate(insertQuery);
	}
	public void removeFavouriteDish(int id, String customerID)
	{
		String insertQuery = "DELETE FROM favourite_dishes where customer_id = '"+customerID+"' AND dish_id = '"+ id +"'";
		dbConnectionHandler.executeUpdate(insertQuery);
	}
	public ArrayList<Favourite> getAllFavourite(String customerID)
	{	
		ArrayList<Favourite> list;	
		FavouriteDAO favouriteDAO = new FavouriteDAO();
		list =  favouriteDAO.getFavourite(customerID);
		return  list;
		
	}
	
}
