<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUpForm</title>
</head>
<body>
	<% String message = (String) request.getAttribute("message"); 
	if(message!= null){
	%>
	<h1 style="color: red;"><%=message %></h1>
	<%} %>
	<form action="SubmitSignUpForm" method="post">
		 <img src="C:\Users\kumar\Downloads\img.jpg" alt="username"><br>
		<input type="text" placeholder="Enter name" name="name"/><p> 
		<label>Enter your email:</label><br>
		<input type="email" placeholder="Enter email" name="emailid"/><p>
		<label>Enter your password:</label><br>
		<input type="password" placeholder="Enter password" name="password"/><p>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>