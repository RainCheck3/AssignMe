<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib
	prefix="c"
	uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="css/application.css">
<link rel="shortcut icon" href="img/favicon.png">
<link rel="stylesheet" href="<c:url value="/css/background.css" />">
</head>
<body>
	<div class="centered grid__col--2">
		<h1 class="headline-primary--grouped">AssignMe</h1>
		</div>
		
	<div class="centered grid__col--3">
        <img class="img--avatar" src="img/avatar.png" alt="Avatar">
        <form:form method="POST" action="/AssignMe/login" commandName="userLogin">
          <label class="form__label--hidden" for="username">Username:</label> 
          <form:input class="form__input" type="text" id="username" placeholder="Username" path="customerId"/>
          <label class="form__label--hidden" for="password">Password:</label>
          <form:input class="form__input" type="password" id="password" placeholder="Password" path="password"/>
          <input class="form__btn" type="submit" value="LOGIN" />
        </form:form>
        <br/>
        <button class="btn--info" onclick="location.href='register'">SIGN UP</button>
	</div>
</body>
</html>