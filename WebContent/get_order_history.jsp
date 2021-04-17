<%@page import="com.comsats.restauto.entity.MainOrder"%>
<%@page import="com.comsats.restauto.utils.OrderController"%>
<%
String customerID = request.getParameter("customerID");
OrderController orderController = new OrderController();

for(MainOrder var : orderController.getAllOrders(customerID))
{
	out.print(var.getID()+","+var.getOrderTime()+","+var.getOrderTotal()+";");
	
	}

%>