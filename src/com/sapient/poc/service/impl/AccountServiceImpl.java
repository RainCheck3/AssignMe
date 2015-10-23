/**
 * 
 */
package com.sapient.poc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.poc.dao.AccountDao;
import com.sapient.poc.model.Customer;
import com.sapient.poc.service.AccountService;

/**
 * @author jxu1
 *
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	
	/* (non-Javadoc)
	 * @see com.sapient.poc.service.AccountService#registerCustomer(com.sapient.poc.model.Customer)
	 */
	@Override
	public boolean registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return (accountDao.registerNewCustomer(customer));
	}

	/* (non-Javadoc)
	 * @see com.sapient.poc.service.AccountService#validateLogin(java.lang.String, java.lang.String)
	 */
	@Override
	public Customer validateLogin(String username, String password) {
		return (accountDao.validateLogin(username, password));
	}

}
