package com.gouzal.quotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/aa")
	public String index() {
		return "index";
	}
	
}
