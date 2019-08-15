<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>
	<h3>Student generated</h3>
	<p>First Name : ${student.first_name}</p>
	<p>Last Name : ${student.last_name}</p>
	<p>Country :  ${student.country }</p>
	<p>Favourite Language :  ${student.fav_lang }</p>
	<p>OS: 
		<ul>
			<c:forEach items="${student.os}" var="item">
			    <li>${item}</li>
			</c:forEach>
		</ul>
	</p>
	<a href="../student/addstudent">Add Another student</a>
</body>
</html>