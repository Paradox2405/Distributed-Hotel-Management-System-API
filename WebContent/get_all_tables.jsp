<%@page import="com.comsats.restauto.entity.Table"%>
<%@page import="com.comsats.restauto.utils.TableController"%>
<%
TableController tableController = new TableController();

for(Table var : tableController.suggestTable())
{
	out.print(var.getTableNumber()+",");
	
	}
%>
