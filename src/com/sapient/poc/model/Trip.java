package com.sapient.poc.model;

import java.util.List;

/**
 * @author jxu1
 * Represents a trip made by a taxi at a particular hour with list of passengers
 */
public class Trip {
	Vehicle vehicle;
	Route route;
	List<Employee> passengerList;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public List<Employee> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Employee> passengerList) {
		this.passengerList = passengerList;
	}
	
	
}
