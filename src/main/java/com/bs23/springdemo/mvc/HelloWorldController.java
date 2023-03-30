package com.bs23.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	public HelloWorldController() {
		System.out.println("Inside Hello World Controller");
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello-world";
	}
	
	// new controller method to read from data and
	// add data to the model
	@RequestMapping("/processFromVersionTwo")
	public String letsShutDude(HttpServletRequest request, Model model) {
		
		// read the request  parameter from the HTMLK form
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		// create message
		String result = "Hello from version2 " + name;
		
		model.addAttribute("message", result);
		
		return "hello-world";
	}
	
	@RequestMapping("/processFromVersionThree")
	public String requestParaString(
			@RequestParam("studentName") String name, 
			Model model) {
		
		
		name = name.toUpperCase();
		
		// create message
		String result = "Hello from version3 " + name;
		
		model.addAttribute("message", result);
		
		return "hello-world";
	}

}
