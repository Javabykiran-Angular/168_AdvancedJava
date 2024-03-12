<%@page import="java.util.List"%>
<%@page import="com.tka.entity.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/bootstrap.css" rel="stylesheet" />
</head>
<body>

<h2>U r in Dashboard JSP</h2>	
<h2>Hi Welcome <%=session.getAttribute("user") %></h2>


<table class="table table-bordered">
	<thead>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Mobile No</th>
		</tr>
	</thead>
	
	<tbody>
	
	<%
		List<Employee> emplist= (List<Employee>) request.getAttribute("emplist");
		for(Employee emp:emplist){
	%>
	
		<tr>
			<td> <%=emp.getId()%> </td>
			<td> <%=emp.getFname()%> </td>
			<td> <%=emp.getMobileno()%> </td>
		</tr>
		<%} %>
	</tbody>
	
</table>
	

</body>
</html>