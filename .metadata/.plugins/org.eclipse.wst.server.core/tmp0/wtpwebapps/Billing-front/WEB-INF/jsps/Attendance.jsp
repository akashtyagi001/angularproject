<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<title>Attendance</title>

</head>
<body>
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
<div class="footer">
  <p>© 2019 Copyright:ABC COMPANY</p>
</div>
	



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

.error{
color:red;
font-size:20px;
}
</style>
</head>
  
    <img src="${pageContext.request.contextPath}/resources/images/irislogo2.gif" alt="abcd"/>
  
    <div class="header">

<h1 text-align="center">ATTENDANCE PAGE</h1>

  
  <div class="header-right">
    <a class="active" href="operator">OPERATOR PAGE</a>
    <a  class="white" href="logout">LOGOUT</a>
    <a  class="white" href="homepage">HOME</a>
  </div>
</div>
</head>
 </div>
 <core:if test="${param.msg ne null}">

	    		<div class="alert alert-success">

	    			${param.msg}

	    		</div>

    		</core:if>	

    		<core:if test="${param.errorMsg ne null}">

	    		<div class="alert alert-danger">

	    			${param.errorMsg}

	    		</div>

    		</core:if>	
<f:form action="submitAttendance" modelAttribute="dataObj" method="get">
<div>
<label>Projects:</label>
			<f:select path="ProjObj.projectId" class="form-control" id="project">
            <core:forEach items="${proj}" var="pOb">
            <f:option value="${pOb.projectId}">${pOb.projectName}</f:option>
             </core:forEach>
             
             </f:select><br>
             
             </div>
             
             <div>
		<label>Employee Name :</label>
		<f:select path="EmpObj.employeeId" class="form-control" id="employee">
 	 		
		</f:select><br>
		</div>
		
		<div>
		<label>Month :</label>
		<f:select path="month" class="form-control" required="true" >
		<f:option value="january">January</f:option>
			<f:option value="february">February</f:option>
			<f:option value="march">March</f:option>
			<f:option value="april">April</f:option>
			<f:option value="may">May</f:option>
			<f:option value="june">June</f:option>
			<f:option value="july">July</f:option>
			<f:option value="august">August</f:option>
			<f:option value="september">September</f:option>
			<f:option value="october">October</f:option>
			<f:option value="november">November</f:option>
			<f:option value="december">December</f:option>
		</f:select>
		<br>
		</div>
		
		<div>
		<label>Year :</label>
		<f:select path="year" id="year" class="form-control" required="true">
			<f:option value="0">Select year</f:option>
		</f:select>
		
		<script type="text/javascript">
			for(y=2015;y<2029;y++){
				var optn = document.createElement("OPTION");
				optn.text=y;
				optn.value=y;
				
				if(y==2019){
					optn.selected=true;
				}
				document.getElementById('year').options.add(optn);
			}
		</script>
		</div>
		<br>
		<div>
		<label>Half day:</label>
		<f:input path="halfDay" size="30" class="form-control" placeholder="Enter Number of Half Days" required="true"/><br>
		
		</div>
		
		<div>	
			<label>Full Day:</label>
			<f:input path="fullDay" size="30" class="form-control" placeholder="Enter Number of Full Days" required="true"/><br>
				
		</div>
		
		<div class="form-group">
		    <button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</f:form>

	
	
	</div>

	<script type="text/javascript">

		$('select#project').on('change', function() {
			$('#employee').empty()
			console.log('I m here');

			$("div#msg").html("");

			var projectId=this.value;

			console.log('Project Id : '+projectId);

			$.get("getEmployeesList?projectId="+projectId, function(data, status){

			    

			    console.log(data.length);

			    if(data.length!=0){

			    console.log('I m in if');

			    data.forEach(function(el, index) {

			    	console.log('Hello I m in for Each..');

			        console.log(el.employeeId+" "+el.employeeName);

			      var o = new Option(el.employeeName, el.employeeId);

		                 /// jquerify the DOM object 'o' so we can use the html method

		                 $(o).html(el.employeeName);

		                 $("#employee").append(o)
	
			      });

			    }

			    else {

			    	console.log('I m in else');

			    	$("div#msg").html("No Employee exist for the given project...");

			    	$('#employee').empty()

			    	//$("#employee").hide();

			    }

			   

			  });

			

		});

	</script>
<div class="footer">
  <p>© 2019 Copyright:IRIS SOFTWARE</p>
</div>
	</body>

</html>
