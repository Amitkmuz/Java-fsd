<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Html WEb Page</h2>
<%!
int a,b,sum;
%>
<%
//int a=10;
//int b=20;
 sum=a+b;

out.println("Welcome to JSP<br>");
out.println("sum of two number is "+sum);
a=100;
b=200;
sum=a+b;
out.println("<br/><font color=red> Sum of two number is "+sum);
%>
<br/>
<p>Sum of two number is <%=10+20 %></p>
<p>Sum of two number is <%=sum %></p>
<font color="red">Sum of <%=a %>and<%=b %>is<%=sum %></font>

</body>
</html>