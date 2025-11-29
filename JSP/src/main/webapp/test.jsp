<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <!-- Declaration Tag -->
      
      <%!
      
      int a=10;
      
      public String getMessage(){
    	  return "Good Morning";
      }
      
      public void test(){
    	  int a=10;
    	  int b=20;
    	  int result=a+b;
      }
      
      %>
      
      <!-- Expression Tag -->
      
      <h1>Value of a is: <%=a %></h1>
      <h1>Message: <%= getMessage() %></h1>
   <%--   <h1>test: <%=test() %>></h1>    methods with return type void are not allowed --%>
   
      <!-- Scriptlet tag -->
      
      <% 
      String message="How are you";  
      
      out.print("<h1>Hey this is service method</h1>");
   
      %>
      
      <h1>Msg: <%=message %>></h1>
  
</body>
</html>