/**
 * 
 */
package com.sapient.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.poc.model.Customer;

/**
 * @author jxu1
 * Navigation of pages controlled by this Spring controller
 */

@Controller
public class NavigationController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homePage(Customer customer) {
		return new ModelAndView("index", "userLogin", new Customer());
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(Customer customer) {
		return new ModelAndView("registerPage", "userRegister", new Customer());
	}
}
