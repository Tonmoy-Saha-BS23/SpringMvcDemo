package com.bs23.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private String[] operatingSystem;
	private LinkedHashMap<String, String> countryOptions;
	public Student() {
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("IND", "India");
		countryOptions.put("BAN", "Bangladesh");
		countryOptions.put("FRA", "France");
		countryOptions.put("USA", "United States of America");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = countryOptions.get(country);
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}
	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	public String[] getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String[] operatingsystems) {
		this.operatingSystem = operatingsystems;
	}
	
}
