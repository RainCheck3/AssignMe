<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib
	prefix="c"
	uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="css/application.css">

<style>
.headline-primary--grouped {
	color: #1fbad6
}

label::before {
	content: "*";
	padding-right: 4px;
	font-size: 16px;
	color: #1fbad6;
}

.signup-form-section {
	position: relative;
}

.signup-form-section {
	padding-bottom: 50px;
	margin-bottom: -25px;
}

.signup-form-section .signup-form-section-required {
	position: absolute;
	right: 0;
	top: 4px;
	font-size: 10px;
	font-weight: 500;
}

.signup-form-section .signup-form-section-title {
	font-size: 22px;
	font-weight: 400;
}

.signup-form-section-notice {
	text-align: center;
	color: #666;
	font-size: 13px;
	font-weight: 500;
}

.signup-form-section-notice .star {
	color: #1fbad6;
}
</style>
</head>
<body>
	<div class="grid">
		<div class="centered grid__col--6">
			<h1 class="headline-primary--grouped">SIGN UP TO RIDE</h1>
			<br /> <img src="img/sample.jpg" alt="sample image">
		</div>

		<form:form method="POST" action="/AssignMe/registerSubmit" commandName="userRegister">
			<div class="centered grid__col--6">

				<div class="signup-form-section account">
					<div class="signup-form-section-title">
						<p>Account</p>
					</div>
					<div class="signup-form-section-required">
						<label for="required"></label>Required
					</div>


					<label for="username">USERNAME</label>
					<form:input class="form__input" type="text" id="username" placeholder="Username" path="customerId" />


					<label for="password">PASSWORD</label>
					<form:input class="form__input" type="password" id="password" placeholder="Password" path="password" />
				</div>
				<div class="signup-form-section profile">
					<div class="signup-form-section-title">
						<p>Profile</p>
					</div>
				</div>

				<label for="name">NAME</label>


				<form:input class="form__input" type="text" id="" placeholder="First Name" path="firstName" />
				<form:input class="form__input" type="text" id="" placeholder="Last Name" path="lastName" />

				<input class="form__btn" type="submit" value="CREATE ACCOUNT" />
			</div>

			<div class="signup-form-section-notice" style="">
				Please fill out all required (<span class="star">*</span>) fields.
			</div>
			<br />

		</form:form>
	</div>
</body>
</html>