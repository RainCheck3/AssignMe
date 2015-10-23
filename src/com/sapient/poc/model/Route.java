package com.sapient.poc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jxu1
 * Contains list of addresses in particular route
 */
public class Route {
	private List<Address> addressList;
	private int turnaroundTime;
	
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public int getTurnaroundTime() {
		return turnaroundTime;
	}
	public void setTurnaroundTime(int turnaroundTime) {
		this.turnaroundTime = turnaroundTime;
	}

	
}
