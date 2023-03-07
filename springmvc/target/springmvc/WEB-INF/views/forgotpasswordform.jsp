<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password Form</title>
</head>
<body>
<% String message = (String) request.getAttribute("message"); 
if(message!= null){
%>
<h1 style="color: red;"><%=message %></h1>
<%} %>

<form action="submitforgotpassword" method="post">
	<label>Enter Email</label><br>
		<input type="email" placeholder="Enter email" name="email"/><p>
	<label>Enter Name</label><br>
		<input type="text" placeholder="Enter name" name="name"/><p> 
	<input type="submit" value="Submit" />
</form>
<form action="submitnewpassword" method="post">
	<label>Create new password</label><br>
		<input type="password" placeholder="Enter new password" name="newpass" /><br>
<%if(request.getAttribute("status")!=null){ %>	
	<input type="submit" value="Submit" />	
<%} %>		
</form>
</body>
</html>