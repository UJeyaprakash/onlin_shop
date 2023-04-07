package com.Jprakash.OnlineOrderingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OnlineController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/cum_register")
	public String cumRegister() {
		return "cumRegister";
		
	}
	@GetMapping("/available_items")
	public String getAllItems() {
		return "itemList";
	}
}
