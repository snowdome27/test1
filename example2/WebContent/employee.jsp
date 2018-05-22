<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="model.*" %>
<% Employee emp=new Employee("0001","湊　雄輔"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(int i=0; i<10; i++){ %>
<% if(i%3==0){ %>
<p style="color:red">
<% }else{ %>
<p>
<% } %>
ID= <%= emp.getId() %> name=<%= emp.getName() %></p>
<%} %>
</body>
</html>