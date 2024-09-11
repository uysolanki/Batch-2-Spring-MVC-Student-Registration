<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> User Record Inserted</h1>
<h3>Rno : ${student.rno}</h3>
<h3>Name : ${student.sname}</h3>
<h3>Gender : ${student.gender}</h3>
<h3> Skills </h3>
<c:forEach var="singleSkill" items="${student.sk}">
        <h6>${singleSkill}</h6>
</c:forEach>
</body>
</html>