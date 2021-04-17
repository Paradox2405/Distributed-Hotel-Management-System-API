<%@page import="com.comsats.restauto.entity.Dish"%>
<%@page import="com.comsats.restauto.entity.MainOrder"%>
<%@page import="com.comsats.restauto.utils.OrderController"%>
<% 
String order_ID = request.getParameter("order_ID");
OrderController orderController = new OrderController();

for(Dish var : orderController.getAllOrdersDetails(Integer.parseInt(order_ID)))
{
	out.print(var.getDishName()+","+var.getDishPrice()+","+var.getDishQuantity()+";");
	
	}

%>