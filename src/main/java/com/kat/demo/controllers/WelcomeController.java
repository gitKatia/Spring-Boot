package com.kat.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "welcome";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}

}
