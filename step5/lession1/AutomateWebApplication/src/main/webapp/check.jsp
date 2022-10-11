<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.io.*" %>   
 <%@ page import="java.util.*" %>
 <%@ page import="java.sql.*" %>
 <%@page import="com.Login"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String emailid,password; %>
<%
emailid = request.getParameter("email");
password = request.getParameter("password");
Login l = new Login();
List<Login> listOfObj;
listOfObj = (List<Login>)session.getAttribute("obj");
Iterator<Login> li =listOfObj.iterator();
while(li.hasNext()) {
	Login lr = li.next();
if(lr.getEmailid().equals(emailid) && lr.getPassword().equals(password)){
	%>	
	<h2 id="log">Successfull Login!</h2>
	<%
}else if(emailid.equals("")){
	%>	
	<h2 id="log">Enter Valid EmailID</h2>
	<br>
	<a href="login.jsp">LOGIN</a>
	<%
}else if(password.equals("")){
	%>	
	<h2 id="log">Enter Valid Password</h2>
	<br>
	<a href="login.jsp">LOGIN</a>
	<%
}
else{
	%>
	<h2 id="log">Failure! Try Again</h2>
	<br>
	<a href="login.jsp">LOGIN</a>
	<%
}
}
%>

</body>
</html>