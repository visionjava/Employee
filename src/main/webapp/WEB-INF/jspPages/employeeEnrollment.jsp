<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Enrollment Form</title>
</head>
<body>
	
		<h1>Employee Enrollment Form</h1>
	
<form:form name="employee" id="enrollmentForm" action="submitEnrollment" commandName="employee">
	<table cellspacing="0" cellpadding="0" border="0" width="718">
		<tr>
			<td>Employee ID:</td>
			<td><form:input path="employeeId" /> <form:errors path="employeeId" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td colspan="2">&nbsp;</td>
		</tr>
		<tr>
			<td>Employee First Name:</td>
			<td><form:input path="firstName" /> <form:errors
					path="firstName" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td colspan="2">&nbsp;</td>
		</tr>
		<tr>
			<td>Employee Last Name:</td>
			<td><form:input path="lastName" /> <form:errors path="lastName" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td colspan="2">&nbsp;</td>
		</tr>
		<tr>
			<td>Employee Date Of Birth:</td>
			<td><form:input path="dateOfBirth" /> <form:errors
					path="dateOfBirth" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td colspan="2">&nbsp;</td>
		</tr>
		<tr>
			<td>Place Of Birth:</td>
			<td><form:input path="placeofBirth" /> <form:errors
					path="placeofBirth" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td colspan="2">&nbsp;</td>
		</tr>
		<tr>
		<td colspan="2" align="center">
		<input type="submit" id="submitButton" name="enrollmentSubmit" value="Submit Enrollment"/>
	</table>
</form:form>



</body>
</html>