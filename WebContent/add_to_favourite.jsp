<%@page import="com.comsats.restauto.utils.FavouriteController"%>
<%
int dishID = Integer.parseInt(request.getParameter("id"));
String customerID = request.getParameter("customerID");
FavouriteController favouriteController = new FavouriteController();
if(favouriteController.checkFavouriteDish(dishID,customerID).equals("already"))
{
	out.print("already");
}
else
{
	favouriteController.addFavouriteDish(dishID,customerID);
	out.print("success");
}
%>