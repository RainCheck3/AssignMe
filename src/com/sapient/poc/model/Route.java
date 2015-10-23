package com.sapient.poc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	
	@OneToOne
	@JoinColumn(name="ADDRESS1_ID", referencedColumnName="ADDRESS_ID")
	private Address address1;
	
	@OneToOne
	@JoinColumn(name="ADDRESS2_ID", referencedColumnName="ADDRESS_ID")
	private Address address2;
	
	@OneToOne
	@JoinColumn(name="ADDRESS3_ID", referencedColumnName="ADDRESS_ID")
	private Address address3;
	
	@OneToOne
	@JoinColumn(name="ADDRESS4_ID", referencedColumnName="ADDRESS_ID")
	private Address address4;
	
	private int turnaroundTime;
	
	
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	public Address getAddress2() {
		return address2;
	}
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}
	public Address getAddress3() {
		return address3;
	}
	public void setAddress3(Address address3) {
		this.address3 = address3;
	}
	public Address getAddress4() {
		return address4;
	}
	public void setAddress4(Address address4) {
		this.address4 = address4;
	}
	public int getTurnaroundTime() {
		return turnaroundTime;
	}
	public void setTurnaroundTime(int turnaroundTime) {
		this.turnaroundTime = turnaroundTime;
	}

	
}
