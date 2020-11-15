<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*, model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%

    List<User> losUsuarios=(List<User>) request.getAttribute("LISTAUSUARIOS");

%>



   
<body>
<h1>Hola</h1>
 <%= losUsuarios%>

</body>
</html>