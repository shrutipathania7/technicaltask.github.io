<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-Up Form</title>
 <style>
        /* body{
            background-color: brown;
            padding:5px ;
            margin: 10px;
        } */
        form {
            border-style: dashed;
            border-width: 5px;
            background: grey;
            text-decoration: solid;
            padding: 50px;
            text-align: center;
            text-emphasis: none;
            margin: 100px 400px;
            text-transform: capitalize;
            /* border: 100px;
            background-origin: padding-box; */
        }
    </style>
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