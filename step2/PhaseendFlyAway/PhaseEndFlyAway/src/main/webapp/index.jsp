<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>FlyAway</h2>
<form action=FlightList method=post>
	<label for=from>From :-</label>
	 <input type=text name=from id=from/><br><br>
	<label for=to>To :-</label>
	 <input type=text name=to id=to/><br><br>
	<label for=departure>Departure :-</label>
	 <input type=date name=departure id=departure/><br><br>
	<label for=travellers>Travellers :-</label> 
	<input type=number name=travellers id=travellers/><br><br>
	<input type=submit value=Search /> 
	<input type=reset />
</form>
<a href="AdminPage.jsp">Admin Login</a>|
<a href=UserPage.jsp>User Login</a>
</body>
</html>