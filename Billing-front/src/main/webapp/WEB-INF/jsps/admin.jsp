<html>
	<head>
		<title>Adminpage</title>
	</head>
	<body>
		
		
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
 
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

<h1 text-align="center">ADMIN PAGE</h1>

  
  <div class="header-right">
    <a class="active" href="homepage">Home</a>
    <a  class="white" href="logout">LOGOUT</a>
  </div>
</div>
</head>
 </div>
<div>
	<style>
	.abc{
	background-color:blue;
	color:white;
	float:right;
	}
	</style>	
	<h4 class="abc">Welcome : Admin </h5><hr/>

	</div>
<div align="center">

		<h1 style="background-color:lightblue;color:darkblue">Admin Page </h1><hr/>

	</div>

	

<div class="dropdown" align="center">

    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">

      Admin Options

    </button>

    <div class="dropdown-menu">

      <a class="dropdown-item" href="Config">Configure Project</a>

      <a class="dropdown-item" href="Allocation">Allocate Project</a>
  
   <a class="dropdown-item" href="ViewEmployee">View Employee Details</a>
  
    </div>

  </div>
  
<div class="footer">
  <p>© 2019 Copyright:IRIS SOFTWARE</p>
</div>
	</body>
</html>