<%@page import="com.comsats.restauto.entity.Favourite"%>
<%@page import="com.comsats.restauto.utils.FavouriteController"%>
<%@page import="com.comsats.restauto.entity.Dish"%>
<%@page import="com.comsats.restauto.utils.DishController"%>
<%
String customerID = request.getParameter("customerID");
FavouriteController favController = new FavouriteController();
DishController dishController = new DishController();

for(Favourite var : favController.getAllFavourite(customerID))
{
	Dish dishDetail = dishController.getAllFavDishes(var.getDishID());
	
	out.println(dishDetail.getDishID() +"---" + dishDetail.getDishCategory() + "---" + dishDetail.getDishName() + "---" + dishDetail.getDishDescription() +
			"---"+ dishDetail.getDishPrice() + "---"+ dishDetail.getDishCalories() +"---"+ dishDetail.getDishDiscount() + 
			"---" + dishDetail.getDishCookTime()+"---"+ dishDetail.getDishImage()+"---"+dishDetail.getDishStatus()+"---"+dishDetail.getDishUnit()+";");
	
	}
%>
