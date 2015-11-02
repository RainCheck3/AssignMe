<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Choose your destination</title>
</head>
<body>

<h1>Please select your destination</h1>

<img src="http://greeleyhistory.org/maps/grid_greeley.jpg" width="500" height="442">

<br/>


<form action="/AssignMe/assign" method="GET">
  <input type="radio" name="address" value="A1" checked>A1
  <br/>
  <input type="radio" name="address" value="A2">A2
  <br/>
  <input type="radio" name="address" value="B1">B1
  <br/>
  <input type="radio" name="address" value="B2">B2
  <br/>
  Departure hour
  <br/>
    <select name="departureHour">
    <option value="5">5:00 PM</option>
    <option value="6">6:00 PM</option>
    <option value="7">7:00 PM</option>
    <option value="8">8:00 PM</option>
  </select>
  
  <br/><br/>
  <input type="submit" value="Assign Me">
</form>

</body>
</html>