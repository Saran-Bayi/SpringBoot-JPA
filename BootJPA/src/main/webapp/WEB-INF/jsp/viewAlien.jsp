<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="5">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Technology</th>

			<th colspan="2">Action &nbsp;<a href="add">Add Alien</a></th>
		</tr>
		<c:forEach items="${aliens}" var="aliens" varStatus="count">
			<tr>
				<td>${count.count}</td>
				<td><c:out value="${aliens.name}"></c:out></td>
				<td><c:out value="${aliens.tech}"></c:out></td>

				<td><a href="edit?id=<c:out value="${aliens.id}"/>">Update</a></td>
				<td><a
					href="delete?id=<c:out value="${aliens.id}"/>">Delete</a></td>
			</tr>
		</c:forEach>
		
		</table>


</body>
</html>