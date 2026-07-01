<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.mvc.model.Student" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>

<%
Student s=(Student)request.getAttribute("student");
%>

<h2>Student Details</h2>

Student ID :
<%= s.getId()%>

<br><br>

Student Name :
<%= s.getName()%>

<br><br>

Course :
<%= s.getCourse()%>

</body>
</html>