/**
 * 
 */
package com.learn.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.learn.mvc.modal.Customer;
import com.learn.mvc.modal.Customers;

/**
 * @author 9501800
 *
 */
@Component
public class CustomerService {
	
	@Autowired
	RestTemplate restTemplate;
	
	public Customers getCustomers() {		
		
		List<MediaType> mediaTypes = new ArrayList<MediaType>();
	    mediaTypes.add(MediaType.APPLICATION_JSON);
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(mediaTypes);
	    HttpEntity<Customer> httpEntity = new HttpEntity<Customer>(null, headers);
		
		//Customer cus = restTemplate.getForObject("http://localhost:8082/learnrest-web/rest/en/customer/getCustomer", Customer.class);
		
		//ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity("http://localhost:8082/learnrest-web/rest/en/customer/getCustomers", Object[].class);
		
		return restTemplate.getForObject("http://localhost:8082/learnrest-web/rest/en/customer/getCustomers", Customers.class);
		
	}

}
