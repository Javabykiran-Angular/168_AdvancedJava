<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="bootstrap/bootstrap.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<h2>Home Page</h2>

<div class="container">
<table class="table table-bordered ">
	<thead>
		<tr>
			<th>Id</th>		
			<th>Action</th>	
			<th>First Name</th>
			<th>Email Id</th>
			<th>Mobile No</th>
		</tr>
	</thead>
	
	
	<tbody>
	
	<c:forEach var="person" items="${personlist}"  >
	<tr>
			<td> ${person.id} </td>		
		<td> <a href="/getparticurlardata/${person.id}"  class="btn btn-success">Updat
			<td> ${person.name} </td>
			<td> ${person.emailid } </td>
			<td> ${person.mobileNo } </td>
		</tr>
	
	</c:forEach>
		
	
	</tbody>
</table>

</div>
</body>
</html>