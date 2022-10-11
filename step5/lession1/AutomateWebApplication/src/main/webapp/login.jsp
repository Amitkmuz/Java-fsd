<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<body>
<h2>LOGIN PAGE</h2>
<form action="check.jsp" method="post" onclick="return validateLogin()">
EmailID: <input type="text" name="email" id="n1">
Password: <input type="text" name="password" id="n2">
<input type="submit" value="SUBMIT" id="b1">
<input type="reset" value="RESET">
</form>
<br>
<a href="signup.jsp">SIGNUP</a>
<br>
</body>
</html>