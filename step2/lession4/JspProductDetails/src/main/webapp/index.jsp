<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ProductStoreController" method="get">
<label>Product Name</label>
<input type="text" name="productName"><br/>
<label>Product Category</label>
<input type="text" name="productCategory"><br/>
<label>Product Price</label>
<input type="text" name="productPrice"><br/>
<input type="submit" value="Store Product">
<input type="reset" value="reset">
</form>
</body>
</html>