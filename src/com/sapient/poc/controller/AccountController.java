/**
 * 
 */
package com.sapient.poc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sapient.poc.model.Customer;
import com.sapient.poc.service.AccountService;

/**
 * @author jxu1
 *
 */
@Controller
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("userLogin") Customer user,  ModelMap modelMap, HttpSession session) {
        String username = user.getCustomerId();
        String password = user.getPassword();
        Customer userData;
        
        userData = accountService.validateLogin(username, password);
        
		if (userData != null) {
			session.setAttribute("user", userData);
			modelMap.addAttribute("user", userData);
			return "welcome";
		} else {
		    return "index";
		}
	}
	
	@RequestMapping(value="registerSubmit", method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("userRegister") Customer user, ModelMap modelMap) {
		Customer newCustomer = (Customer) user;
		
		if (accountService.registerCustomer(newCustomer)) {
			return new ModelAndView("index", "userLogin", new Customer());
		} else {
			return new ModelAndView("register", "userRegister", new Customer());
		}
	}
}
