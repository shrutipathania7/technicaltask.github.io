<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-Up Form</title>
</head>
<body>
<% String message = (String) request.getAttribute("message"); 
if(message!= null){
%>
<h1 style="color: red;"><%=message %></h1>
<%} %>
	<form action="submitsignupform" method="post">
		<label>Enter your name:</label><br>
		<input type="text" placeholder="Enter name" name="name"/><p> 
		<label>Enter your email:</label><br>
		<input type="email" placeholder="Enter email" name="emailid"/><p>
		<label>Enter your password:</label><br>
		<input type="password" placeholder="Enter password" name="password"/><p>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>