<%@page import="com.Login"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String eid,pass; %>
<%
eid = request.getParameter("emailid");
pass = request.getParameter("password");
Login l = new Login();
l.setEmailid(eid);
l.setPassword(pass);
request.getSession(true);
Object obj = session.getAttribute("obj");
List<Login> listOfObj;
if(obj==null){
	listOfObj = new ArrayList<Login>();
	listOfObj.add(l);
	session.setAttribute("obj", listOfObj);
	%>
	<h2 id="abc">Account Created Successfully</h2>
	<%
}else{
	listOfObj = (List<Login>)session.getAttribute("obj");
	listOfObj.add(l);
	session.setAttribute("obj", listOfObj);
	%>
	<h2 id="abc">Account Created Successfully</h2>
	<%
}
%>
</body>
</html>