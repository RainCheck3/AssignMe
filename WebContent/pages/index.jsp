<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="css/application.css">
<link rel="shortcut icon" href="img/favicon.png">
</head>
<body>
	<div class="centered grid__col--2">
		<h1 class="headline-primary--grouped">AssignMe</h1>
		</div>
		<%-- <form:form method="POST" action="/AssignMe/login"
			commandName="userLogin" cssClass="abc">
			<table>
				<tr>
					<td>Username</td>
					<td><form:input path="customerId" /></td>
					<td><form:errors path="customerId" cssClass="errMsg"></form:errors></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password" /></td>
					<td><form:errors path="password" cssClass="errMsg"></form:errors></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit" />
				</tr>
			</table>
		</form:form> --%>
		
	<div class="centered grid__col--3">
        <img class="img--avatar" src="img/avatar.png" alt="Avatar">
        <form:form method="POST" action="/AssignMe/login" commandName="userLogin">
          <label class="form__label--hidden" for="username">Username:</label> 
          <form:input class="form__input" type="text" id="username" placeholder="Username" path="customerId"/>
          <label class="form__label--hidden" for="password">Password:</label>
          <form:input class="form__input" type="password" id="password" placeholder="Password" path="password"/>
          <input class="form__btn" type="submit" value="LOGIN" style="width:377px"/>
        </form:form>
        <br/>
        <button class="btn--info" onclick="location.href='register'" style="width:377px">SIGN UP</button>
	</div>
	
</body>
</html>