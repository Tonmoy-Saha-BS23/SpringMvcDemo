<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- jstl tag for using form tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Customer RegistrationForm</title>
	<style type="text/css">
		.error{
		color:red
		}
	</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		
		First Name: <form:input path="firstName"/>
		
		<br><br>
		
		Last Name*: <form:input path="lastNameString" />
		<form:errors path="lastNameString" cssClass="error"/>
		<br> <br>
		
		Free Pass: <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"/>
		<br><br>
		
		Postal Code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		<br><br>
		
		<input type="submit" value="submit">
	
	</form:form>
	<br>
	<a href="..">Back </a>
</body>
</html>