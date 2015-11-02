package com.sapient.poc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


/**
 * @author jxu1
 * Taxi containing passengers
 */

@Entity
@Table(name="VEHICLE")
@NamedQueries(value = {@NamedQuery(name = "Vehicle.findAll", query = "from Vehicle v")})
	public class Vehicle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="VEHICLE_ID")
	private int vehicleId;
	
	@Column(name="CAPACITY")
	private int capacity;
	
	@OneToOne
	@JoinColumn(name="ROUTE_ID", referencedColumnName="ROUTE_ID")
	private Route route;
	
	@Transient
	private int currentPassengerCount;
	
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
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public int getCurrentPassengerCount() {
		return currentPassengerCount;
	}
	public void setCurrentPassengerCount(int currentPassengerCount) {
		this.currentPassengerCount = currentPassengerCount;
	}
	
	public boolean isFull() {
		if (currentPassengerCount < capacity) {
			return false;
		}
		return true;
	}
	
}

//Make abstract? Extend if want to account for more than one type of vehicle? ...
