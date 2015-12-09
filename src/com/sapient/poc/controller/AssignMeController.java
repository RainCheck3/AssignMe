package com.sapient.poc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sapient.poc.model.Address;
import com.sapient.poc.model.Customer;
import com.sapient.poc.model.Trip;
import com.sapient.poc.service.AssignMeService;

/**
 * @author jxu1
 *
 */

@Controller
@SessionAttributes("user")
public class AssignMeController {

	@Autowired
	AssignMeService assignMeService;

	@RequestMapping(value = "/assign", method = RequestMethod.GET)
	public String login(@RequestParam("departureHour") int hourOfDeparture, ModelMap modelMap,
			HttpSession session) {

		Customer passenger = (Customer) session.getAttribute("user");
		Address address = passenger.getAddress();
		
		Trip trip = assignMeService.assignCab(address.getAddressId(), hourOfDeparture, passenger);

		if (trip != null) {

			modelMap.addAttribute("trip", trip);
			modelMap.addAttribute("address", address);
			modelMap.addAttribute("hour", hourOfDeparture);

			return "cabAssigned";
		} else {
			return "noCabAvailable";
		}
	}
}
