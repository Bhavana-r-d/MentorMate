<%@page import="com.mentormate.mentormate.models.UsersModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
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
	List<UsersModel> listOfMentees = (List<UsersModel>) request.getAttribute("listOfMentees");
	request.setAttribute("u", users);
	%>

	<p>First Name: ${u.firstName}</p>
	<p>Last Name: ${u.lastName}</p>
	<p>Email: ${u.email}</p>
	<p>Designation: ${u.designation}</p>
<!-- list/table -->
	<ul>
		<%
		for (UsersModel mentee : listOfMentees) {
			request.setAttribute("mentee", mentee);
		%>
		<li>${mentee.firstName}</li>
		<%
		}
		%>
		
	</ul>
</body>
</html>