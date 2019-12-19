
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

    <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Project Billing</title>

</head>

<body>

	<h3>Project Billing</h3><hr>

	<h5>Billing for ${name} of ${month} is :</h5>

	<h4 style="font-size : 45px;color:black"><strong> $ ${bill} </strong></h4>

	

	<hr>

	<h5>No. of Employees : <strong>${count}</strong></h5>

	

	<div>

		<table "align="center" border="1px" class="table table-striped table-bordered table-hover ">

			<thead class=thead-dark>

				<tr align="center">

					<th>EmployeeName</th>

					<th>Role</th>

					<th>Per Hour Billing  <i class="fas fa-dollar-sign"> </th>

					<th>Total Billing</th>

				</tr>

			</thead>		

		<tbody>

		 <core:forEach items="${devl}" var="pOb">

			<tr align="center">

				<td>${pOb.getDvObj().getName()}</td>

				<td>${pOb.getPrcObj().getDrObj().getName() }</td>

				<td>${pOb.getPrcObj().getBill() } </td>

				<td><strong>${myMap.get(pOb.getdvObj().getDevId())}</strong></td>

			</tr>

		</core:forEach>

		</tbody>

		</table>

	</div>
<div class="footer">
  <p>© 2019 Copyright:IRIS SOFTWARE</p>
</div>
</body>

</html>