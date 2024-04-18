<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="bootstrap/bootstrap.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>

<h1>Login Page</h1>

	<div class="container">
		
		<div class="mb-2 mt-2">
			<form action="login" method="post">
			<label>Username::</label>
			<input type="text" class="form-control" name="username" placeholder="Enter the Username..."> <br>
			<label>Password::</label>
			<input type="password" name="password" class="form-control" placeholder="Enter the Password.." ><br>
			<button class="btn btn-success" type="submit" >Login</button>
			</form>
		</div>
		
	</div>


</body>
</html>