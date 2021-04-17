<%@page import="com.comsats.restauto.entity.Feedback"%>
<%@page import="com.comsats.restauto.utils.FeedbackController"%>
<%@page import="com.comsats.restauto.entity.MainOrder"%>
<%@page import="com.comsats.restauto.utils.OrderController"%>
<% 
String customerID = request.getParameter("customerID");
FeedbackController feedbackController = new FeedbackController();

for(Feedback var : feedbackController.getFeedbackList(customerID))
{
	out.print(var.getFeedbackDate()+","+var.getFeedbackRatig()+","+var.getFeedbackRemarks()+";");
	
	}

%>