<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<%-- 
   <%
       String name = request.getParameter("un");
       String email = request.getParameter("ue");
       String address = request.getParameter("ua");
    %>
    
    <h2>User Details</h2>
  <h3>  Name: <%=name %> </h3>
  <h3>  Email: <%=email %> </h3>
   <h3> Address: <%=address %></h3>
 --%> 
 
 <h2>User Details</h2>
 <h3>Name: <%=request.getParameter("un") %></h3>
 <h3>Email: <%=request.getParameter("ue") %></h3>
 <h3>Address: <%=request.getParameter("ua") %></h3>
 
 <hr>


</body>
</html>