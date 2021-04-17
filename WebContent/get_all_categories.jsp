<%@page import="com.comsats.restauto.entity.Category"%>
<%@page import="com.comsats.restauto.utils.CategoryController"%>
<%
CategoryController categoryController = new CategoryController();
for(Category var : categoryController.getAllCategories(""))
{
	out.println(var.getCatId() +"---" + var.getCatName() + "---" + var.getCatImage() + "---" + var.getCatStatus() +";");
	
	}
%>
