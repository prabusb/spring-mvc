/**
 * 
 */
package com.learn.mvc.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.springdata.domain.Address;
import com.learn.springdata.domain.Employee;
import com.learn.springdata.repository.EmployeeRepository;

/**
 * Component class to return the message for the controller.
 * 
 * @author Prabu S B
 *
 */
@Component
public class ProvideMessageService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/**
	 * Method to return message.
	 * @return String message
	 */
	public String provideMessage() {
		
		List<Employee> employeeList = employeeRepository.findByFirstName("TATA");
		System.out.println("Employee Name:" + employeeList.get(employeeList.size() - 1).getFirstName());
		System.out.println("City Name:" + employeeList.get(employeeList.size() - 1).getAddress().getCity());
		return "Successfully Loged in";
	}
	
	public void createUser(String firstName, String lastName) {
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		Address address = new Address();
		address.setCity("Chennai");
		address.setStreet("First Street");
		employee.setAddress(address);
		//List<Address> addressList = new ArrayList<Address>();
		//addressList.add(address);
		//employee.setAddress(addressList);
		employeeRepository.save(employee);
	}
	
	public void checkExceService() throws Exception {
		throw new Exception(); 
	}

}
