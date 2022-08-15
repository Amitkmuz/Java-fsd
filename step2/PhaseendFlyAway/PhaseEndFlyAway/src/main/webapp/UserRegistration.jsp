<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<a href=index.jsp>Main Page</a>
<br><br>
<form action=UserRegistration method=post>
	<label for=email>Email :-</label>
	<input type="email" name=email id=email /><br><br>
	<label for=password>Password :-</label> 
	<input type="password" name=password id=password /><br><br>
	<label for=name>Name :-</label> 
	<input type="text" name=name id=name /><br><br>
	<label for=phone>Phone No. :-</label> 
	<input type="text" name=phone id=phone /><br><br>
	<label for=adhaar>Aadhaar No. :-</label> 
	<input type="text" name=adhaar id=adhaar /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>
</body>
</html>