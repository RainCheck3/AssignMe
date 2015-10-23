package com.sapient.poc.model;


/**
 * @author jxu1
 * Taxi containing passengers
 */
public class Vehicle {
	private int vehicleId;
	private int capacity;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}

//Make abstract? Extend if want to account for more than one type of vehicle? ...
