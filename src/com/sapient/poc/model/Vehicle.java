package com.sapient.poc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author jxu1
 * Taxi containing passengers
 */

@Entity
@Table(name="VEHICLE")
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
	@JoinColumn(name="ROUTE_ID")
	private Route route;
	
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
	
}

//Make abstract? Extend if want to account for more than one type of vehicle? ...
