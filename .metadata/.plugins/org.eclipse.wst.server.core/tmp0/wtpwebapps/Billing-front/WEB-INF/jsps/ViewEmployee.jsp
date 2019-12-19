<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

    <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">



  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>



  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>



  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>View employee details</title>
<style>
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: #D49292;
   color: white;
   text-align: center;
}
</style>
<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: silver;
  padding: 20px 10px;
  
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;\
 
}


.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header a.white {
  background-color: black;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 700px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }

  
  .header-right {
    float: none;
  }
}
</style>
</head>
  
    <img src="${pageContext.request.contextPath}/resources/images/irislogo2.gif" alt="abcd"/>
  
    <div class="header">

<h1 text-align="center">VIEW EMPLOYEE DETAILS PAGE</h1>

  
  <div class="header-right">
    <a class="active" href="admin">ADMIN</a>
    <a  class="white" href="homepage">HOME</a>
    <a  class="white" href="logout">LOGOUT</a>
  </div>
</div>
</head>
 </div>
<body>

</div>

<div class="d-flex justify-content-around">

<form action="Bill"  method="get">
			
<div>
						<label>Employee Name :</label>
						<select name="employeeId" class="form-control">
							<core:forEach items="${DL}" var="pOb">
								<option value="${pOb.employeeId}" >${pOb.employeeName}</option>
							</core:forEach>
						</select><br>
					</div>

					

					<!--<div  >

						<label>Month :</label> <br>

						<input type="text" name="month" size="30" class="form-control" placeholder="Select Month" required/><br>

					</div> -->

					

					

					<div>

						<label>Month :</label>

						<select  name="month" class="form-control" required="true">

							<option value="january">January</option>

							<option value="february">February</option>

							<option value="march">March</option>

							<option value="april">April</option>

							<option value="may">May</option>

							<option value="june">June</option>

							<option value="july">July</option>

							<option value="august">August</option>

							<option value="september">September</option>

							<option value="october">October</option>

							<option value="november">November</option>

							<option value="december">December</option>

						</select>

						<br>

					</div>

					

					

					<div>

					<label>Year :</label>

					<input type="number" name="year" size="30" class="form-control" placeholder="Select Year" required/><br>

					</div>

					

					<div class="form-group">

							    <button type="submit" class="btn btn-primary">Submit</button>

					</div>

				</form>

</div>
<div class="footer">
  <p>© 2019 Copyright:IRIS SOFTWARE</p>
</div>


</body>

</html>