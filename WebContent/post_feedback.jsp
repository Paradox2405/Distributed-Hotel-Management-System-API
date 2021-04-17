<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.comsats.restauto.entity.Feedback"%>
<%@page import="com.comsats.restauto.utils.FeedbackController"%>
<%
String rating = request.getParameter("rating");
String remarks = request.getParameter("remarks");
String customerID = request.getParameter("customerID");

FeedbackController feedbackController = new FeedbackController();
Feedback newFeedback = new Feedback();

DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
Date date = new Date();
String feedbackDate = dateFormat.format(date);

newFeedback.setFeedbackRatig(rating);
newFeedback.setCustomerID(customerID);
if(remarks == null || remarks.equals(""))
{
	newFeedback.setFeedbackRemarks("No Remarks Found!");
}
else
{
newFeedback.setFeedbackRemarks(remarks);
}
newFeedback.setFeedbackDate(feedbackDate);
newFeedback.setStatus("new");

feedbackController.postFeedback(newFeedback);
out.print("true");
%>