package com.comsats.restauto.utils;

import com.comsats.restauto.dao.GenericDAO;
import com.comsats.restauto.dao.TaxDAO;

public class TaxController {
	GenericDAO dbConnectionHandler;
	
	public TaxController()
	{
		dbConnectionHandler = new GenericDAO();
	}

	public String checkTax()
	{
		TaxDAO checkTaxRate = new TaxDAO();
		return checkTaxRate.checkTAX();
	}
	
}
