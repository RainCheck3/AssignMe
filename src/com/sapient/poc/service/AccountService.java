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
	public boolean registerCustomer(Customer customer);
	public Customer validateLogin(String username, String password);
}
