/**
 * 
 */
package com.sapient.poc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sapient.poc.model.Customer;

/**
 * @author jxu1
 *
 */
@Repository
public class AccountDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
		
	public boolean registerNewCustomer(Customer newCustomer) {
		
		hibernateTemplate.saveOrUpdate(newCustomer);
		return true;
	}

	public Customer validateLogin(String username, String password) {
		String[] namedParams = {"customerId","password"};
		Object[] paramValues = {username,password};		
		/*if (username.equalsIgnoreCase("rain") && password.equals("hunter2")) {
			return true;
		}*/
		List<?> listUser = (List<?>) hibernateTemplate.findByNamedQueryAndNamedParam("Customer.findByUserIdandPassword", namedParams, paramValues);
		if(!listUser.isEmpty()){
			return (Customer)listUser.get(0);
		}else {
			return null;
		}
	}

	public boolean updateCustomer(Customer customer) {
		return false;
	}

	public boolean removeCustomer(String username) {
		return false;
	}

	/*
	 * public boolean addNewRoute(Route route); public boolean removeRoute(Route
	 * route); public boolean updateRoute(Route route); public boolean
	 * addNewVehicle(Vehicle vehicle); public boolean removeVehicle(Vehicle
	 * vehicle); public boolean updateVehicle(Vehicle vehicle); public List
	 * fetchVehicles();
	 */
}
