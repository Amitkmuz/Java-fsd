<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg }
<h2>Search User by UserId</h2>
<form action="searchUser" method="get">
<label>UID</label>
<input type="number" name="uid"><br/>
<input type="submit" value="Search User"/>
<input type="reset" value="reset"/>
</form>
<a href="updateUser.jsp">Update User</a>
</body>
</html>