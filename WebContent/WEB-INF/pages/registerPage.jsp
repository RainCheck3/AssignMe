<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" type="text/css" href="../../css/loginStyle.css" />
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/shop-homepage.css" rel="stylesheet">
<style type="text/css">
.errMsg {
color : red;
left: 30%;
}

</style>
</head>
<body>
<div id="register">
		<h3>
			<strong>Welcome.</strong> Please register.
		</h3>
 		<form:form method="POST" action="/AssignMe/registerSubmit" commandName="userRegister" cssClass="abc"> 
		<table>
			<tr>
				<td>Username</td>
				<td><form:input path="customerId" /></td>
 				<td><form:errors path="customerId" cssClass="errMsg"></form:errors></td> 
			</tr>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /></td>
 				<td><form:errors path="firstName" cssClass="errMsg"></form:errors></td> 
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input type="password" path="password"/></td>
 				<td><form:errors path="password"  cssClass="errMsg"></form:errors></td> 
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" />
				
			</tr>
		</table>
 	</form:form> 		
	</div>
</body>
</html>