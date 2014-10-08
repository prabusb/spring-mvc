/**
 * 
 */
package com.learn.mvc.modal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Prabu S B
 *
 */
public class CreateUser {
	
	@NotNull(message="not null")
	@NotEmpty(message="Can not be Null")
	@Email	
	private String userName;
	
	@NotNull
	@NotEmpty(message="Can not be Null")
	@Size(min = 1, max = 15, message = "Password must between 1 to 15 Characters.")
	private String password;
	
	@NotNull
	@NotEmpty(message="Can not be Null")	
	@Size(min = 1, max = 15, message = "Password must between 1 to 15 Characters.")
	private String confirmPassword;
	
	private String address;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
