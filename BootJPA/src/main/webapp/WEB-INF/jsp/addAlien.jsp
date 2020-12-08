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

	<h2>Add Alien</h2>
	<form:form method="post" action="add" modelAttribute="aa">

		<table>
			<tr>
				<td>Alien Name</td>
				<td><input type="text" name="name" path="${aa.name}" /></td>
			</tr>
			<tr>
				<td>Alien technology</td>
				<td><input type="text" name="tech" path="${aa.tech}" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>

	</form:form>


</body>
</html>