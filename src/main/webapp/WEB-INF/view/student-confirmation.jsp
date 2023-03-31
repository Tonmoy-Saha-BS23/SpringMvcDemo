<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- jstl tag for looping over collections -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
	<h3>Operating Systems: </h3>
	<!-- looping over the operating system array -->
	<ul>
		<c:forEach var="sys" items="${student.operatingSystem}">
			<li>${sys}</li>
		</c:forEach>
	</ul>
	<a href="showForm">Back</a>
</body>
</html>