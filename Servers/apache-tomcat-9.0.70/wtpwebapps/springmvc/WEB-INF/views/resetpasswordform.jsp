<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password Reset</title>
</head>
<body>
	<form action="submitnewpass" method="post">
		<label>Create new password</label><br> 
		<input type="password" placeholder="Enter new password" name="newpass" /><p>
		<label>Confirm new password</label><br>
		<input type="password" placeholder="Confirm password" name="confirmpass" /><p>
		<input type="submit" name="Submit" />
	</form>
</body>
</html>