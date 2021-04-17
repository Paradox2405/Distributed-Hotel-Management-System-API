package com.comsats.restauto.utils;

import java.util.ArrayList;

import com.comsats.restauto.dao.GreetingDAO;
import com.comsats.restauto.entity.Greeting;


public class GreetingController {
	GreetingDAO greetingDAO;
	
	public GreetingController(){
		greetingDAO = new  GreetingDAO();
	}
	
	public ArrayList<Greeting> getAllGreetingsList(String displayDate){
		ArrayList<Greeting> greetingList=greetingDAO.getGreetingMessages(displayDate);
		return greetingList;
	}
}
