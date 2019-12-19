  
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Customer form</title>
	</head>
	<body>
		<h1 style="text-align: center;font-family: verdana;color: green">
			${Cust}
		</h1>
		
		<hr/>
		
		<div align="center">
			<h1>Registration Form</h1>
			<f:form action="registerCustomer" method="post" modelAttribute="CustomerObj">
			<table>
				<tr>
					<td>Customer Id : </td>
					<td><f:input path="customerId"/></td>
				</tr>
				<tr>
					<td>Customer Name : </td>
					<td><f:input path="customerName"/></td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><f:password path="password"/></td>
				</tr>
				<tr>
					<td>Gender : </td>
					<td><f:input path="gender"/></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit" value="Sign Up"/>
					</td>
				</tr>
			</table>
			</f:form>
		</div>
		
	</body>
</html>