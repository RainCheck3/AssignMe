package com.sapient.client.cui;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains list of addresses in particular route
 * 
 * @author jxu1
 *
 */
public class Route {
	List<Address> addressList;
	private int turnaroundTime;

	public Route() {
		addressList = new ArrayList<Address>();
	}
}
