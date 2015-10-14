package com.sapient.client.cui;

import java.util.ArrayList;
import java.util.List;

/**
 * Taxi containing passengers
 * 
 * @author jxu1
 *
 */
public class Vehicle {
	private int capacity;
	List<Passenger> vehiclePassengerList;

	public Vehicle() {
		vehiclePassengerList = new ArrayList<Passenger>();
	}

	public void addPassenger(Passenger passenger) {
		vehiclePassengerList.add(passenger);
	}

}

//Make abstract? Extend if want to account for more than one type of vehicle? ...
