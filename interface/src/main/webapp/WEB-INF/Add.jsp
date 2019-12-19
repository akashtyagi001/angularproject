<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Spring Web MVC</title>
		
		
	</head>
	
	
	<body>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<h1 style="text-align: center;font-family: verdana;color: green">
			
		</h1>
		
		<hr/>
		
		<div align="center">
			<h1>Add Product</h1>
			<f:form action="addProduct" method="post"  id="form" modelAttribute="pObj">
		    
			<table>
				
				<tr>
					<td>ID : </td>
					<td><f:input path="productId" id="id"/>
					
					</td>
				</tr>
				<tr>
					<td>Name : </td>
					<td><f:input path="productName" id="name"/>
					
					</td>
				</tr>
				<tr>
					<td>Price : </td>
					<td><f:input path="price" price="price"/>
				
					</td>
				</tr>
				
				<tr>
					<td></td>
					<td>
				
					<input type="button" value ="Add" id="submit" <%--onclick="myFunction()"--%>/>
				
						</td>
				</tr>
			</table>
			</f:form>
				
			
						
						
						
						
			
		</div>
<%--		<script>
		
		function myFunction() {
		  var id = document.getElementById("id").value;
		 var n = document.getElementById("name").value;
		 var p = document.getElementById("price").value;
		  var r = confirm("Are you sure you want to add? \nId ="+id+"\nProduct Name ="+n+"\nPrice ="+p);
		  if (r == true) {
			  document.getElementById("form").submit();
		  } else {
		  alert("Your changes are not saved");
		  }
		
		}
		</script>--%>
		<script>
	$("#submit").click(function() {
			  var id = document.getElementById("id").value;
			 var n = document.getElementById("name").value;
			 var p = document.getElementById("price").value;
			  var r = confirm("Are you sure you want to add? \nId ="+id+"\nProduct Name ="+n+"\nPrice ="+p);
			  if (r == true) {
				  document.getElementById("form").submit();
			  } else {
			  alert("Your changes are not saved");
			  }
			
			}
	});
	
	</script>
		
	</body>
</html>