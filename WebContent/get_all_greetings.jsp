<%@page import="com.comsats.restauto.entity.Greeting"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.comsats.restauto.utils.GreetingController"%>
<%@page import="com.comsats.restauto.entity.Category"%>
<%@page import="com.comsats.restauto.utils.CategoryController"%>
<%
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
String toDayDate = dateFormat.format(date);

GreetingController greetingController = new GreetingController();
for(Greeting var : greetingController.getAllGreetingsList(toDayDate))
{
	out.println(var.getGreetingId() +"---" + var.getGreetingTitle() + "---" + var.getGreetingDescription() + "---" + var.getBanner() +";");
	
}
%>
