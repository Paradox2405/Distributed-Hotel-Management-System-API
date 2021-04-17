<%@page import="com.comsats.restauto.entity.OrderDetail"%>
<%@page import="com.comsats.restauto.entity.MainOrder"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.comsats.restauto.utils.OrderController"%>
<%
OrderController orderController = new OrderController();
MainOrder mainOrder = new MainOrder();
String cart = request.getParameter("cart");
int tableNo = Integer.parseInt(request.getParameter("tableNo"));
String instruction = request.getParameter("instruction");
String actualTime = request.getParameter("time");
String customerID = request.getParameter("customerID");


int estimatedTime = Integer.parseInt(String.valueOf(Math.round(Float.parseFloat(actualTime))));
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
Date date = new Date();
String orderTime = dateFormat.format(date);

mainOrder.setCustomerID(customerID);
mainOrder.setTableNo(tableNo);
mainOrder.setSpecialInstructions(instruction);
mainOrder.setEstimatedTime(estimatedTime);
mainOrder.setActualTime(actualTime);
mainOrder.setOrderTime(orderTime);


int orderId= orderController.saveOrder(mainOrder);

String [] allURLs = cart.split(",");
OrderDetail item_details;

for (int i=0; i<allURLs.length; i++) {
	item_details = new OrderDetail();
	String [] detail = allURLs[i].split(":");
	item_details.setDishID((Integer.parseInt(detail[0])));
	item_details.setDishQuantity(detail[1]);
	item_details.setOrderTime(orderTime);
	orderController.saveOrderDetail(item_details, orderId);
}

out.println(orderId);

%>