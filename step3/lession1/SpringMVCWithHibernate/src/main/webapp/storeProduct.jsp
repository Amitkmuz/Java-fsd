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
<h2>Add Product</h2>
<form action="storeProduct" method="post">
<label>PID</label>
<input type="number" name="pid"><br/>
<label>PNAME</label>
<input type="text" name="pname"><br/>
<label>PRICE</label>
<input type="number" name="price"><br/>
<label>URL</label>
<input type="url" name="url"><br/>
<input type="submit" value="Add Product"/>
<input type="reset" value="reset"/>

</form>
<a href="index.jsp">Back</a>
</body>
</html>