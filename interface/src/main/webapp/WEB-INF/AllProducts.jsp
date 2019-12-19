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
	
		
		
		<h1>Product's List</h1>
		
		<table border="1">
		<tr>
			<th>Id</th>
			<th> Name</th>
			<th>Price</th>
			
		</tr>
		<c:forEach items="${pList}" var="pObj">
			<tr>
				<td>${pObj.productId}</td>
				<td>${pObj.productName}</td>
				<td>${pObj.price}</td>
				
			</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>