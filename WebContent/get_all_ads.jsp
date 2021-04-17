<%@page import="com.comsats.restauto.entity.Ad"%>
<%@page import="com.comsats.restauto.utils.AdsController"%>
<%
AdsController adsController = new AdsController();
for(Ad var : adsController.getAdsList())
{
	out.println(var.getAdId() +"," + var.getAdName() + "," + var.getAdDescription() + "," + var.getBannerName() +";");
	
	}
%>
