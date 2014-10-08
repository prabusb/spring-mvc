/**
 * 
 */
package com.learn.springdata.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.learn.springdata.domain.Employee;

/**
 * @author 9501800
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	/**
     * Find by name.
     * 
     * @param name
     *            the employee name
     * @return the Employee
     */
     List<Employee> findByFirstName(String name);

}
