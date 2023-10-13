package com.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(path="/")
	public String home() {
		return "home";
	}
	
	@RequestMapping(path="/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping(path="/contact")
	public String contact() {
		return "contact";
	}
}
