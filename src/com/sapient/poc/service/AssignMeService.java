/**
 * 
 */
package com.sapient.poc.service;

import com.sapient.poc.model.Customer;
import com.sapient.poc.model.Trip;

/**
 * @author jxu1
 *
 */
public interface AssignMeService {
	Trip assignCab(String addressCode, int hourOfDeparture, Customer passenger);
}
