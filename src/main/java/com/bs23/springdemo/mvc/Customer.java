package com.bs23.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message="is required")
	private String lastNameString;
	
	@NotNull(message = "is required")
	@Min(value = 0, message="Value must be greater than equal to zero")
	@Max(value = 5, message = "Value must be less than equal to five")
	private Integer freePasses; // making int to Integer to get @notNull validation message as I want
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "length msut me five (digit/char")
	private String postalCode;
	
	
	public Customer() {
		System.out.println("Customer Object is Created");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNameString() {
		return lastNameString;
	}
	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
