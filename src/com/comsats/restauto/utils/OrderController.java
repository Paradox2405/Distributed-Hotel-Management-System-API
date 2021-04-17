package com.comsats.restauto.utils;

import java.util.ArrayList;

import com.comsats.restauto.dao.GenericDAO;
import com.comsats.restauto.dao.OrderMainDAO;
import com.comsats.restauto.entity.Dish;
import com.comsats.restauto.entity.MainOrder;
import com.comsats.restauto.entity.OrderDetail;

public class OrderController {

	GenericDAO dbConnectionHandler;
	
	public OrderController()
	{
		dbConnectionHandler = new GenericDAO();
	}
	
	public int saveOrder(MainOrder newOrder)
	{
		String query = "INSERT INTO order_main (customer_id,table_id,order_datetime,customer_instruction,estimated_time_min," +
				"actual_time,created_on,STATUS) values('"+newOrder.getCustomerID()+"','"
				+ newOrder.getTableNo() + "', '"+newOrder.getOrderTime()+"','" + newOrder.getSpecialInstructions() + "'" +
						",'"+newOrder.getEstimatedTime()+"','"+newOrder.getActualTime()+"','"+newOrder.getOrderTime()+"','new')";
		 return dbConnectionHandler.executeUpdateWithId(query);
	}
	public int saveOrderDetail(OrderDetail newOrderDetail, int orderId)
	{
		String query = "INSERT INTO order_detail (order_id,dish_id,quantity,created_on," +
				"STATUS) values('"
				+ orderId + "', '"+newOrderDetail.getDishID()+"','" + newOrderDetail.getDishQuantity() + "'" +
						",'"+newOrderDetail.getOrderTime()+"','true')";
		 return dbConnectionHandler.executeUpdate(query);
	}
	
	public ArrayList<MainOrder> getAllOrders(String customerID)
	{
		ArrayList<MainOrder> list;
		OrderMainDAO orderList = new OrderMainDAO();
		list = orderList.getAllOrders(customerID);
		return list;
		
	}
	
	public ArrayList<MainOrder> getCurrentOrders(String customerID)
	{
		ArrayList<MainOrder> list;
		OrderMainDAO orderList = new OrderMainDAO();
		list = orderList.getCurrentOrders(customerID);
		return list;
		
	}
	public ArrayList<Dish> getAllOrdersDetails(Integer order_ID)
	{
		ArrayList<Dish> list;
		OrderMainDAO orderList = new OrderMainDAO();
		list = orderList.getAllOrdersDetails(order_ID);
		return list;
		
	}
}
