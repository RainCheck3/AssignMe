/**
 * 
 */
package com.sapient.poc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sapient.poc.model.Trip;
import com.sapient.poc.model.Vehicle;

/**
 * @author jxu1
 *
 */
@Repository
public class AssignMeDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public List<Vehicle> getAllVehicles() {
		return (List<Vehicle>)hibernateTemplate.findByNamedQuery("Vehicle.findAll");
	}
}
