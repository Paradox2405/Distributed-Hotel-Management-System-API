<%@page import="com.comsats.restauto.entity.Dish"%>
<%@page import="com.comsats.restauto.utils.DishController"%>
<%
int id = Integer.parseInt(request.getParameter("id"));
DishController dishController = new DishController();

for(Dish var : dishController.getAllDishes(id))
{
	out.println(var.getDishID() +"---" + var.getDishCategory() + "---" + var.getDishName() + "---" + var.getDishDescription() +
			"---"+ var.getDishPrice() + "---"+ var.getDishCalories() +"---"+ var.getDishDiscount() + 
			"---" + var.getDishCookTime()+"---"+ var.getDishImage()+"---"+var.getDishStatus()+"---"+var.getDishUnit()+";");
	
	}
%>
