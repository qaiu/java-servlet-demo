<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= ((List)request.getAttribute("doorList")).get(0) %> <br>
	<%= ((List)request.getAttribute("doorList")).get(1) %> <br>
	<%= ((List)request.getAttribute("doorList")).get(2) %> <br>
	
</body>
</html>