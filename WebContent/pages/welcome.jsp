<%@ page
	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib
	prefix="c"
	uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html">
<html>
<head>
<meta
	http-equiv="Content-Type"
	content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link
	rel="stylesheet"
	href="<c:url value="/css/application.css" />">
<link
	rel="stylesheet"
	href="<c:url value="/css/background.css" />">
</head>
<body>
	<div class="grid">

		<header
			class="grid__col--12 panel--padded--centered"
			role="banner">
			<img src="img/favicon.png"> 
			<div class="capitalize">
				<h1 class="headline-primary--grouped">Welcome, ${user.firstName }</h1>
				<br />
			</div>
			<nav
				class="navbar"
				role="navigation">
				<span
					id="toggle"
					class="icn--nav-toggle is-displayed-mobile"> <b class="srt">Toggle</b>
				</span>
				<ul class="nav is-collapsed-mobile">
					<li class="nav__item"><a href="${pageContext.request.contextPath}/welcome">Home</a></li>
					<li class="nav__item"><a href="#buttons">Account</a></li>
					<li class="nav__item"><a href="${pageContext.request.contextPath}/enterTime">Assign</a></li>
					<li class="nav__item"><a href="${pageContext.request.contextPath}/logout">Log Out</a></li>
				</ul>
			</nav>
		</header>
		</div>
</body>
</html>