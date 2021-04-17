<%@page import="com.comsats.restauto.entity.MainOrder"%>
<%@page import="com.comsats.restauto.utils.OrderController"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%
String customerID = request.getParameter("customerID");

OrderController orderController = new OrderController();

for(MainOrder var: orderController.getCurrentOrders(customerID))
{
	out.print(var.getID()+",");
}

%>