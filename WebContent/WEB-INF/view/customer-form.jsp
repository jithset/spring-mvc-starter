<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>
<style type="text/css">
	.error {
		color:red;
	}
</style>
</head>
<body>
<h3>Add Customer</h3>
<form:form action="processrequest" modelAttribute="customer">
	<label>Firstname</label>
	<form:input path="first_name"/>
	<br><br>
	<label>Lastname</label>
	<form:input path="last_name"/>
	<form:errors path="last_name" cssClass="error"/>
	<br><br>
	<label>Freepass</label>
	<form:input path="freepass"/>
	<form:errors path="freepass" cssClass="error"/>
	<br><br>
	<label>Postal Code</label>
	<form:input path="postalcode"/>
	<form:errors path="postalcode" cssClass="error"/>
	<br><br>
	<label>Course Code</label>
	<form:input path="courseCode"/>
	<form:errors path="courseCode" cssClass="error"/>
	<br><br>
	<button type="submit">Add Customer</button>
</form:form>


</body>
</html>