package com.sapient.model;

import java.util.List;

/**
 * Prioritize requests, assign passengers to vehicles, generate hourly report
 * with passenger-vehicle pairings
 * 
 * @author jxu1
 *
 */
public class Coordinator {

	List<Employee> passengerList;
	List<Vehicle> availableVehicleList;
	List<Vehicle> occupiedVehicleList;
	List<Route> routeList;
	List<Trip> tripList;
	//Data structure that maps hour of departure to passengers departing that hour
	
	public void AssignPassengersToVehicles(int hourOfDeparture) {

	}

	private void PrintReport(int hourOfDeparture) {

	}
}
