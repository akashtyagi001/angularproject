<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>About us</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
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

<h1 text-align="center">ABOUT  US</h1>

  
  <div class="header-right">
    <a class="active" href="homepage">Home</a>
    <a class="active" href="contact">Contact us</a>
        <a class="active" href="about">About us</a>
    
    <a href="login">ADMIN</a>
    <a href="login">OPERATOR</a>
  </div>
</div>
</head>
 </div>
<p>Iris Software is a global Information Technology services organization offering high-quality solutions to businesses. It services the information technology requirements of Fortune 1000 companies by utilizing specialized domain knowledge, best-of-breed technologies, rapidly deployable proprietary frameworks/solutions and flexible engagement models.
</p>
<p>We have been serving our customers for over 25 years from our offices in New York, Toronto, New Delhi and our headquarters, Edison, New Jersey. We service our customers across two broad business lines - Financial Services and Enterprise Services.
</p>
<p>Iris provides thought leadership to solve business problems creatively by conceptualizing & delivering uncommon solutions leveraging existing technologies & new computing paradigms such as Digital Transformation, Machine Learning, Analytics & Insights, Cloud Computing & Process Automation. Iris continually innovates to accelerate outcomes such as time-to-market, lower costs, ease of maintenance & reduced TCO.

</p>
<div class="footer">
  <p>© 2019 Copyright:IRIS SOFTWARE</p>
</div>

</body>

</html>