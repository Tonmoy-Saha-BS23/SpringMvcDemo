package com.bs23.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("Inside the home controller");
	}
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
