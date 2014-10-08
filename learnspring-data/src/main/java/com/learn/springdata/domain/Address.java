/**
 * 
 */
package com.learn.springdata.domain;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



/**
 * @author 9501800
 *
 */
@Entity
public class Address {	
	
	private Long id;
    
    private String street;    
    
    private String city;
    
   // private Employee employee;
	
    /**
     * Gets the id.
     * 
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets the employee.
     * 
     * @return the employee
     */
    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_fk")
    @JsonIgnore
	public Employee getEmployee() {
		return employee;
	}*/

	/**
	 * @param employee the employee to set
	 */
	/*public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/

}
