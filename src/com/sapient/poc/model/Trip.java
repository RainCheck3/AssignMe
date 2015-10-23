package com.sapient.poc.model;

import java.util.List;

/**
 * @author jxu1
 * Represents a trip made by a taxi at a particular hour with list of passengers
 */
public class Trip {
	Vehicle vehicle;
	Route route;
	List<Customer> passengerList;
	
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
	public List<Customer> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Customer> passengerList) {
		this.passengerList = passengerList;
	}
	
	
}
