<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Info</title>
</head>
<body>
	<h3>First Name: ${customer.firstName}</h3>
	<h3>Last Name: ${customer.lastNameString}</h3>
	<h3>Free Passes: ${customer.freePasses}</h3>
	<h3>Postal Code: ${customer.postalCode}</h3>
	<br>
	<a href="showForm">Back</a>
</body>
</html>