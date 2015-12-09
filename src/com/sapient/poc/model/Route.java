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
 * Contains list of addresses in particular route
 */

@Entity
@Table(name="ROUTE")
public class Route implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ROUTE_ID")
	private int routeId;
	
	@Column(name="ADDRESS1")
	private int addressId1;
	
	@Column(name="ADDRESS2")
	private int addressId2;
	
	@Column(name="ADDRESS3")
	private int addressId3;
	
	@Column(name="ADDRESS4")
	private int addressId4;
	
	@Column(name="TURNAROUND_TIME")
	private int turnaroundTime;

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	

	public int getAddressId1() {
		return addressId1;
	}

	public void setAddressId1(int addressId1) {
		this.addressId1 = addressId1;
	}

	public int getAddressId2() {
		return addressId2;
	}

	public void setAddressId2(int addressId2) {
		this.addressId2 = addressId2;
	}

	public int getAddressId3() {
		return addressId3;
	}

	public void setAddressId3(int addressId3) {
		this.addressId3 = addressId3;
	}

	public int getAddressId4() {
		return addressId4;
	}

	public void setAddressId4(int addressId4) {
		this.addressId4 = addressId4;
	}

	public int getTurnaroundTime() {
		return turnaroundTime;
	}

	public void setTurnaroundTime(int turnaroundTime) {
		this.turnaroundTime = turnaroundTime;
	}

}
