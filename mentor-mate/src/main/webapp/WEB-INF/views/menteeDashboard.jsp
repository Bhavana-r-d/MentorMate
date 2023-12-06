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
	%>

	<table>
		<tr>
			<th>Id</th>
			<th>Item</th>
			<th>ItemCount</th>
			<th>Description</th>
			<th>OrderDate</th>
		</tr>

		<%
		for (OrderModel o : orders) {
			request.setAttribute("o", o);
		%>
		<tr>
			<td>${o.id}</td>
			<td>${o.item}</td>
			<td>${o.itemCount}</td>
			<td>${o.description}</td>
			<td>${o.orderDate}</td>
			<td><a href="delete?id=${o.id}">Delete</a> <a
				href="edit?id=${o.id}">Edit</a></td>
		</tr>
		<%
		}
		%>

	</table>
</body>
</html>