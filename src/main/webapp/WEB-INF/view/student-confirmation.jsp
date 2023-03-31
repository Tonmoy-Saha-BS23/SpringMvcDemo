<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-confirmation</title>
</head>
<body>
	<h3>Student is Confirmed: ${student.firstName} ${student.lastName}</h3>
	<h3>Country: ${student.country}</h3>
	<h3>Favorite Language: ${student.favouriteLanguage}</h3>
	<a href="showForm">Back</a>
</body>
</html>