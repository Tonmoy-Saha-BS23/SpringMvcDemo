package com.bs23.springdemo.mvc;

public class Student {
	private String firstName;
	private String lastName;
	
	
	public Student() {
		System.out.println("Student Object is Crerated");
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
	
	

}
