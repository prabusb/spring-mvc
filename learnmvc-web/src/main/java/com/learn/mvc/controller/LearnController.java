/**
 * 
 */
package com.learn.mvc.controller;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.learn.mvc.modal.CreateUser;
import com.learn.mvc.service.CustomerService;
import com.learn.mvc.service.ProvideMessageService;

/**
 * Controller to handle all incoming request to the corresponding business logic and
 * reply or forward to the corresponding view with required modal.
 * 
 * @author Prabu S B
 * 
 */
@Controller
public class LearnController {
	
	@Autowired
	private ProvideMessageService provideMessageServic;
	
	@Autowired
	private CustomerService customerService;
	
	/**
	 * Method to return the createUser page where user can create an account.
	 * 
	 * @param modele
	 *            Model
	 * @return String viewName
	 */
	@RequestMapping(value = "/createUser", method = RequestMethod.GET)
	public String createUser(Model model) {
		provideMessageServic.createUser("TATA", "SB");
		CreateUser c = new CreateUser();
		c.setAddress("Chennai");
		model.addAttribute("createUser", c);
		return "CreateUser";
	}



	/**
	 * Method to login the user in to the application. First validation needs to be done to check correct
	 * whether correct inputs are given by user. If yes then return Done page.
	 * 
	 * @param createUser
	 *            CreateUser
	 * @param result
	 *            BindingResult
	 * @param model
	 *            Model
	 * @return String viewName
	 */
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@Valid CreateUser createUser, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "CreateUser";
		} else {
			String showMessage = provideMessageServic.provideMessage();
			model.addAttribute("showMessage", showMessage);
			return "Done";
		}

	}
	
	/**
	 * Method to return the createUser page where user can create an account.
	 * 
	 * @param modele
	 *            Model
	 * @return String viewName
	 */
	@RequestMapping(value = "/displayCustomer", method = RequestMethod.GET)
	public String getCustomer(Model model) {
		model.addAttribute("customers", customerService.getCustomers().getCustomer());
		return "customer";
	}
	
	@RequestMapping(value = "/checkException", method = RequestMethod.GET)
	public String checkExceptionHandling(Model model) throws Exception {
		
			provideMessageServic.checkExceService();
		return null;
	}
	
	
	 @ExceptionHandler(Exception.class)
	 @ResponseBody
    public String handleException(Exception e, HttpServletRequest request) {
		 System.out.println("Inside handleException");
        return "error";
    }

}
