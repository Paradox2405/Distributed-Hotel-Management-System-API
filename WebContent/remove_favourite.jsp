<%@page import="com.comsats.restauto.utils.FavouriteController"%>
<%
int dishID = Integer.parseInt(request.getParameter("id"));
String customerID = request.getParameter("customerID");
FavouriteController favouriteController = new FavouriteController();

	favouriteController.removeFavouriteDish(dishID,customerID);
	out.print("Removed");
%>