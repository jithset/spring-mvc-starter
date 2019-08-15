<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>
	<form:form action="process-student" modelAttribute="student">
		<label>Firstname:</label>
		<form:input path="first_name"/>
		<br><br>
		<label>Lastname:</label>
		<form:input path="last_name"/>
		<br><br>
		<form:select path="country">
			<form:options items="${student.countryList}"/>
		</form:select>
		<br><br>
		Favourite Language:
		<form:radiobutton path="fav_lang" value="c"/>
		<label>C</label>
		<form:radiobutton path="fav_lang" value="java"/>
		<label>Java</label>
		<form:radiobutton path="fav_lang" value="py"/>
		<label>Python</label>
		<form:radiobutton path="fav_lang" value="php"/>
		<label>PHP</label>
		<br><br>
		OS Comfortable:
		<form:checkbox path="os" value="Linux"/>
		<label>Linux</label>
		<form:checkbox path="os" value="Mac"/>
		<label>Mac OS</label>
		<form:checkbox path="os" value="Windows"/>
		<label>Windows</label>
		<br><br>
		<button type="submit">Add Student</button>
	</form:form>
</body>
</html>