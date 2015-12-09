<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Choose your departure time</title>
<link rel="stylesheet" href="css/application.css">
<link rel="stylesheet" href="<c:url value="/css/background.css" />">
</head>
<body>
	<div class="grid">
	<div class="grid__col--12 panel--padded--centered">
			<h1>Please select your time of departure</h1>
	</div>
	</div>
	<div class="inner">

		<div style="background: #FFFFFF" class="centered grid__col--2">
		<form action="/AssignMe/assign" method="GET">
			Departure hour <br />
			<select name="departureHour">
				<option value="5">5:00 PM</option>
				<option value="6">6:00 PM</option>
				<option value="7">7:00 PM</option>
				<option value="8">8:00 PM</option>
			</select> <br />
			<br /> <input type="submit" value="Assign Me">
		</form>
		</div>
		</div>
</body>
</html>