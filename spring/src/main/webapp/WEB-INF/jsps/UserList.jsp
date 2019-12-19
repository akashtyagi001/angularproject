<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List</title>
</head>
<body>
	<div align="center">
	
		
		${msg}
		<h1>Users List</h1>
		
		<table border="1">
		<tr>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Gender</th>
			<th colspan="2">Options</th>
		</tr>
		<c:forEach items="${usersList}" var="userObj">
			<tr>
				<td>${userObj.customerId}</td>
				<td>${userObj.customerName}</td>
				<td>${userObj.gender}</td>
				<td><a href="${path}/updateUser/${userObj.CustomerId}">Update</a></td>
				<td><a href="${path}/deleteUser/${userObj.CustomerId}">Delete</a></td>
			</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>