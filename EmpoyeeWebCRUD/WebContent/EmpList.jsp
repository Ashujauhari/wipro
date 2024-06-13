<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="com.emp.model.Employee, java.util.List"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>	Employee List</title>
</head>
<body>
<H1>	Employee List </H1>
<center>
		<h4><a href="new">Add New Employee</a>&nbsp;&nbsp;&nbsp;
            <a href="list">List Employees</a>             
        </h4>
   </center>	     
 
        <% List<Employee> el=(List)request.getAttribute("emplist") ;%>
        
	<table border="2" cellpadding="5" align="center">
	<tr><th> No</th> <th> Name</th> <th>Salary</th></tr>
	 <%  for (int i = 0; i < el.size(); i++) 
	       {   			 Employee e1 = el.get(i);
	      				 System.out.println(e1.getEno());%>
	 					<tr><td><% out.println(e1.getEno()); %></td>
		       			<td> <% out.println(e1.getEname());%></td>
		      			<td> <% out.println(e1.getSalary());%></td>
		</tr>
		 <% }%>
	</table>		
</body>
</html>