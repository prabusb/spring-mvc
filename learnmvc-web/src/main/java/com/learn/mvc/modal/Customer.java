/**
 * 
 */
package com.learn.mvc.modal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 9501800
 *
 */
public class Customer {
	
	private String id;
	
	private String name;
	
	private String country;
	
	private String city;
	
	 private final List<Link> links = new ArrayList<Link>();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}
	
	 /**
     * Sets the links.
     * 
     * @param links the links to add to the list
     */
    public void setLinks(List<Link> links) {
        this.links.addAll(links);
    }

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	

}
