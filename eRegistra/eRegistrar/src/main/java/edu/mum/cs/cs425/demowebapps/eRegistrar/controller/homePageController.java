package edu.mum.cs.cs425.demowebapps.eRegistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homePageController {
	
	@GetMapping("/")
	public String getHomePage() {
		
		return "home/index";
	}

}
