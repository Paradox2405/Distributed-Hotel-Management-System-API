<%@page import="com.comsats.restauto.entity.CallWaiter"%>
<%@page import="com.comsats.restauto.utils.CallWaiterController"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%
String tableNo = request.getParameter("tableNo");
String customerID = request.getParameter("customerID");

DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
String callDate = dateFormat.format(date);

CallWaiterController callWaiterController = new CallWaiterController();
CallWaiter newCall = new CallWaiter();
newCall.setCalltableNo(Integer.parseInt(tableNo));
newCall.setCustomerID(customerID);
newCall.setCallDateTime(callDate);
newCall.setCallStatus("new");
callWaiterController.doCall(newCall);
out.print("true");

%>