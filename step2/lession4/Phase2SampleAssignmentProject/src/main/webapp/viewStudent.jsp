<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br/>
<h2>Display Student records using JSTL</h2>
<table>
    <tr>
    <th>SID</th>
    <th>SNAME</th>
    <th>AGE</th>
    </tr>
<core:forEach  items="${sessionScope.listOfStudent}" var="student">
  <tr>
  <td> <core:out value="${student.sid }"></core:out></td>
  <td> <core:out value="${student.sname }"></core:out></td>
  <td> <core:out value="${student.age}"></core:out></td>
  </tr>
</core:forEach>
</table>
<a href="home.jsp">Main</a>
</body>
</html>