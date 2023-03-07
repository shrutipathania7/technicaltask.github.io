<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<% String message = (String) request.getAttribute("message"); 
if(message!= null){
%>
<h1 style="color: red;"><%=message %></h1>
<%} %>
	<form action="submitloginform" method="post">

		<label>Email:</label><br> 
		<input type="email" placeholder="Enter email" name="username" />
		<p>
			<label>Password:</label><br> 
			<input type="password" placeholder="Enter password" name="password" />
		<p>
			<a href="forgotpassword">Forgot Password?</a><p>
			<input type="submit" value="Submit" />
	</form>
	
</body>
</html>