/**
 * 
 */
package com.sapient.poc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.poc.dao.AssignMeDao;
import com.sapient.poc.model.Customer;
import com.sapient.poc.model.Trip;
import com.sapient.poc.model.Vehicle;
import com.sapient.poc.service.AssignMeService;

/**
 * @author jxu1
 *
 */
@Service("AssignMeService")
public class AssignMeServiceImpl implements AssignMeService {

	@Autowired
	AssignMeDao assignMeDao;

	static private List<Trip> tripList;
	static private List<Vehicle> fullyAssignedVehicleList;
	static private List<Vehicle> availableVehicleList;

	/*
	 * @see com.sapient.poc.service.AssignMeService#assignCab(java.lang.String)
	 */
	@Override
	public Trip assignCab(int addressId, int hourOfDeparture, Customer passenger) {

		Trip trip;
		List<Customer> passengerList;

		/* Check for returned vehicles */
		checkForReturnedVehicles();
		
		/* Search existing trips for available cabs first */
		trip = searchExistingTrips(addressId, hourOfDeparture, passenger);
		if (trip != null) {
			tripList.add(trip);
			return trip;
		}

		/* Initialize new trip */
		trip = new Trip();
		passengerList = new ArrayList<Customer>();
		passengerList.add(passenger);
		trip.setPassengerList(passengerList);
		trip.setDepartureTime(hourOfDeparture);
		Vehicle newVehicle = null;

		for (Vehicle currentVehicle : availableVehicleList) {
			if (currentVehicle.getRoute().getAddressId1() == addressId) {
				int currentPassengerCount = currentVehicle.getCurrentPassengerCount();
				currentVehicle.setCurrentPassengerCount(currentPassengerCount + 1);
				// check if full after this
				newVehicle = currentVehicle;
				checkIfVehicleFull(newVehicle);
				break;
			} /*else {
				//No available vehicles to service route at the moment
				return null;
			}*/
		}
		trip.setVehicle(newVehicle);

		tripList.add(trip);
		return trip;
	}

	/* Search existing trips for available cabs */
	private Trip searchExistingTrips(int addressId, int hourOfDeparture, Customer passenger) {

		List<Customer> passengerList;

		/* No trips yet */
		if (tripList == null) {
			tripList = new ArrayList<Trip>();
			List<Vehicle> vehicleList = assignMeDao.getAllVehicles();
			fullyAssignedVehicleList = new ArrayList<Vehicle>();
			availableVehicleList = new ArrayList<Vehicle>();
			availableVehicleList.addAll(vehicleList);
			return null;
		}

		/* Search trips for matching address code & departure time */
		for (Trip currentTrip : tripList) {
			/* Match found */
			if (currentTrip.getVehicle().getRoute().getAddressId1() == addressId && currentTrip.getDepartureTime() == hourOfDeparture
					&& availableVehicleList.contains(currentTrip.getVehicle())) {
				/* Don't add same passenger twice to same trip */
				boolean inTrip = false;
				for (Customer current : currentTrip.getPassengerList()) {
					if (current.getCustomerId().equalsIgnoreCase(passenger.getCustomerId())) {
						inTrip = true;
						break;
					}
				}
				if (inTrip == false) {
					int currentPassengerCount = currentTrip.getVehicle().getCurrentPassengerCount();
					currentTrip.getVehicle().setCurrentPassengerCount(currentPassengerCount + 1);
					passengerList = currentTrip.getPassengerList();
					passengerList.add(passenger);
					checkIfVehicleFull(currentTrip.getVehicle());
				}
				return currentTrip;
			}
		}
		/* No matching trip found */
		return null;
	}

	/**
	 * If vehicle is full, add to fullyAssignedVehicleList and remove from
	 * availableVehicleList
	 * 
	 * @param vehicle
	 */
	private void checkIfVehicleFull(Vehicle vehicle) {
		if (vehicle.isFull()) {
			fullyAssignedVehicleList.add(vehicle);
			availableVehicleList.remove(vehicle);
		}
	}

	/**
	 * If vehicle has returned from journey, remove from
	 * fullyAssignedVehicleList and add to availableVehicleList
	 */
	private void checkForReturnedVehicles() {

	}
}
