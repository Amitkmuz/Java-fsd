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
<form action=ForgotPassword method=post>
	<label for=email>Email :-</label>
	<input type="email" name=email id=email /><br><br>
	<label for=pass>New Password :-</label> 
	<input type="password" name=password id=pass /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>
</body>
</html>