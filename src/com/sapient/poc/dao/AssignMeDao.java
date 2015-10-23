/**
 * 
 */
package com.sapient.poc.dao;

import java.util.List;

import com.sapient.poc.model.Employee;
import com.sapient.poc.model.Route;
import com.sapient.poc.model.Vehicle;

/**
 * @author jxu1
 *
 */
public interface AssignMeDao {
	public boolean registerEmployee(Employee employee);
	public boolean validateLogin(String username, String password);
	public boolean updateEmployee(Employee employee);
	public boolean removeEmployee(int employeeID);
	public boolean addNewRoute(Route route);
	public boolean removeRoute(Route route);
	public boolean updateRoute(Route route);
	public boolean addNewVehicle(Vehicle vehicle);
	public boolean removeVehicle(Vehicle vehicle);
	public boolean updateVehicle(Vehicle vehicle);
	public List fetchVehicles();
}