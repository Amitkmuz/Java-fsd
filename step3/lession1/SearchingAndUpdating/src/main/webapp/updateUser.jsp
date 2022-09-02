<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}
<h2>Update User Details</h2>
<form action="updateUser" method="post">
	<label>UId</label>
	<input type="number" name="uid"><br/>
	
	<label>Name</label>
	<input type="text" name="uname"><br/>
	
	<label>Age</label>
	<input type="number" name="uage"><br/>
	
	<input type="submit" value="Update User"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>