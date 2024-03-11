<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%! 
		int count=0;
		public void display(){
			System.out.println("Hello JSP");
		}
		
		public void jspInit(){
			System.out.println("U r in Jsp Init Method");
		}
		
	%>
	
	<%
	count++;
	System.out.println("Count is "+count);
	
	if(count%2==0){
			System.out.println("Even Number "+count);	
			out.print("U r in implict Object Even Number....");
			
			%>
		
		<h2 style="color:green;">Even Number :: <%=count %> </h2>		
		<%		
		}else{
			System.out.println("Odd Number "+count);	
			out.print("U r in implict Object Odd Number....");
		%>
		<h2 style="color:red;"> Odd Number :: <%=count %> </h2>
	<% 	
	}
	
	%>
	<h2>Your count is ::  <%=count %> </h2> 
	
	

</body>
</html>