<%@page import="com.comsats.restauto.entity.Dish"%>
<%@page import="com.comsats.restauto.utils.DishController"%>
<%
String customerID = request.getParameter("customerID");
DishController dishController = new DishController();

for(Dish var : dishController.getAllMostOrder(customerID))
{
	out.println(var.getDishID() +"---" + var.getDishCategory() + "---" + var.getDishName() + "---" + var.getDishDescription() +
			"---"+ var.getDishPrice() + "---"+ var.getDishCalories() +"---"+ var.getDishDiscount() + 
			"---" + var.getDishCookTime()+"---"+ var.getDishImage()+"---"+var.getDishStatus()+"---"+var.getDishUnit()+";");
	
	}
%>
