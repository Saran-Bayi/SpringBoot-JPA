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

<form:form method="post" action="edit"  modelAttribute="aa">

<input type="hidden" name="id" value="${aliens.id}" path="${aa.id}" />
<table>
			<tr>
				<td>Alien Name</td>
				<td><input type="text" name="name" value="${aliens.name}" path="${aa.name}"/></td>
			</tr>
			<tr>
				<td>Alien technology</td>
				<td><input type="text" name="tech" value="${aliens.tech}" path="${aa.tech}"/></td>
			</tr>
			<tr>
				<td><a href="view"><button>Cancel</button></a></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>

</form:form>

</body>
</html>