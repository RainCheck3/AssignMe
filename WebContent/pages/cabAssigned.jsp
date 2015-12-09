<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Trip</title>
<link rel="stylesheet" href="css/application.css">
<link rel="stylesheet" href="<c:url value="/css/background.css" />">
</head>
<body>
	<div class="grid">
	<div class="grid__col--12 panel--padded--centered" style="display:inline-block;">
	${address.street } <br/>${address.city }, ${address.state} ${address.zipcode} <br/>${address.country}
	<br /> Time: ${hour }PM
	<br /> Vehicle ID: ${trip.vehicle.vehicleId }
	<br /> Passenger List: <br />
	<c:forEach var="customer" items="${trip.passengerList}">
		${customer.firstName } ${customer.lastName } <br/>
	</c:forEach>
	<br />
	</div>
	</div>
</body>
</html>