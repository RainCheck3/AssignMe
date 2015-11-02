/**
 * 
 */
package com.sapient.poc.service;

import com.sapient.poc.model.Customer;

/**
 * @author jxu1
 *
 */
public interface AccountService {
	boolean registerCustomer(Customer customer);
	Customer validateLogin(String username, String password);
}
