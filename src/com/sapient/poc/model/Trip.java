package com.sapient.poc.model;

import java.util.List;

/**
 * @author jxu1
 * Represents a trip made by a taxi at a particular hour with list of passengers
 */
public class Trip {
	private Vehicle vehicle;
	private List<Customer> passengerList;
	private int departureTime;
	private int returnTime;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public List<Customer> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Customer> passengerList) {
		this.passengerList = passengerList;
	}
	public int getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	public int getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(int returnTime) {
		this.returnTime = returnTime;
	}
}
