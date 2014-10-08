/**
 * 
 */
package com.learn.mvc.modal;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author 9501800
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customers {
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	 private List<Customer> customer;
	 
	 public Customers() {
	        // TODO Auto-generated constructor stub
	    }

	/**
	 * @return the customer
	 */
	public List<Customer> getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

}
