<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<div id="login">
		<h3>
			<strong>Welcome.</strong> Please login.
		</h3>
 		<form:form method="POST" action="/AssignMe/login" commandName="userLogin" cssClass="abc"> 
		<table>
			<tr>
				<td>Username</td>
				<td><form:input path="customerId" /></td>
 				<td><form:errors path="customerId" cssClass="errMsg"></form:errors></td> 
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
		
	<a href="register" >Register</a>
		
	</div>
</body>
</html>