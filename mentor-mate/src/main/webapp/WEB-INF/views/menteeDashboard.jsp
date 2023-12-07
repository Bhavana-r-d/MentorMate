<%@page import="com.mentormate.mentormate.models.UsersModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test</title>
</head>
<body>
<h1>Mentee Dashboard whoohoo</h1>

	<%
	UsersModel users = (UsersModel) request.getAttribute("mentee");
	request.setAttribute("u", users);
	%>

	<table>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Designation</th>
		</tr>

		<tr>
			<td>${u.id}</td>
			<td>${u.firstName}</td>
			<td>${u.lastName}</td>
			<td>${u.email}</td>
			<td>${u.designation}</td>
		</tr>
	</table>
</body>
</html>