package com.comsats.restauto.utils;

import com.comsats.restauto.dao.GenericDAO;
import com.comsats.restauto.entity.CallWaiter;

public class CallWaiterController extends GenericDAO {
	
	GenericDAO dbConnectionHandler;
	
	public CallWaiterController()
	{
		dbConnectionHandler = new GenericDAO();
	}
	
public void doCall(CallWaiter newCall) {
		
		String insertQuery = "insert into waiter_call(customer_id,table_no,date,STATUS) values('"+newCall.getCustomerID()+"','"+newCall.getCalltableNo()+"','"+newCall.getCallDateTime()+"','"+newCall.getCallStatus()+"')";
		dbConnectionHandler.executeUpdate(insertQuery);
		
	}

}
