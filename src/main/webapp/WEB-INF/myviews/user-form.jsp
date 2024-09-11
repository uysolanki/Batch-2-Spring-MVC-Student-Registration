<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to User Registeration Page</h1>

<form:form action="saveStudentDetails" 	modelAttribute="stud">

	Roll Number :<form:input path="rno" /> <br>
	
	Name :<form:input path="sname"/> <br>
	
	Gender : 
	Male<form:radiobutton path="gender" value="male" />
	Female<form:radiobutton path="gender" value="female" /> <br>
	
	Programming Skills:
	Java<form:checkbox path="sk" value="Java" />
	React<form:checkbox path="sk" value="React" />
	SQL<form:checkbox path="sk" value="SQL" /> <br>
	
	<input type="submit" value="Register">
	
	</form:form>

</body>
</html>