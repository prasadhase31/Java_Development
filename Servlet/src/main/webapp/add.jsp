<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>                          <%--Directive Tag --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%

int i=Integer.parseInt(request.getParameter("num1"));
int j=Integer.parseInt(request.getParameter("num2"));

int k=i+j;

%>                                         <%-- Scriptlet Tag --%>

<h2>Addition = <%= k %></h2>                                  <%-- Expression Tag --%>

</body>
</html>