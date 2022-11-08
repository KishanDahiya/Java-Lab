<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
</head>
<body>
<%
String username=request.getParameter("username"); 
String password=request.getParameter("password");
Cookie vc=new Cookie("Name",username);
Cookie pc=new Cookie("Value",password);
response.addCookie(vc);
response.addCookie(pc);
%>
<%="Cookies have been added succesfully" %>
<%=new Date() %>
<a href="displayCookies.jsp">Display Cookies</a>
</body>
</html>