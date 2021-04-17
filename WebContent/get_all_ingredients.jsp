<%@page import="com.comsats.restauto.utils.IngredientController"%>
<%@page import="com.comsats.restauto.entity.Dish"%>
<%@page import="com.comsats.restauto.utils.DishController"%>
<%
int id = Integer.parseInt(request.getParameter("id"));
IngredientController controller = new IngredientController();
out.print(controller.getAllIngredients(id));
%>
