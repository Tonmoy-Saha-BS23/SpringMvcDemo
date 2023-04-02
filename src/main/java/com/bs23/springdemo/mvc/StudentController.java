package com.bs23.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	public StudentController() {
		System.out.println("Inside student controller class");
	}
	
	@RequestMapping("/showForm")
	public String ShowForm(Model themodel) {
		
		// add student model to the object
		themodel.addAttribute("student", new Student());
		
		return "student-form";
	}
	
	//binding student data with the model
	@RequestMapping("/processForm")
	public String ProcessForm(@ModelAttribute("student") Student student) {
		
		// printing the student data
		System.out.println(student.getFirstName() + student.getLastName());
		return "student-confirmation";
	}
}
