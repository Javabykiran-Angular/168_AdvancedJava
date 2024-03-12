<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/bootstrap.css" rel="stylesheet" />

<%-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> --%>

</head>
<body>

	<div  class="container">
	<form action="LoginServlet" method="post">
		
		<div class="mb-3 mt-3">
			<label>Username:: </label>
			<input type="text" class="form-control" name="username" placeholder="Enter the Username">			
		</div>
		
		<div class="mb-3 mt-3">
			<label>Password:: </label>
			<input type="password" class="form-control" name="password" placeholder="Enter the Password">
			
		</div><br>
		<button type="submit" class="btn btn-success">Login</button>
		</form>
		
	</div>
	


</body>
</html>