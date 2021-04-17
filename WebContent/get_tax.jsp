<%@page import="com.comsats.restauto.utils.TaxController"%>
<%
TaxController controller = new TaxController();
out.print(controller.checkTax());
%>