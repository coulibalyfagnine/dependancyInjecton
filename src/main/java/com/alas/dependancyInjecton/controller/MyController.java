package com.alas.dependancyInjecton.controller;

import org.springframework.stereotype.Controller;

import com.alas.dependancyInjecton.services.IGreetingService;

@Controller
public class MyController {
	
	private final IGreetingService greetingService;
		
	public MyController(IGreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	
	public IGreetingService getGreetingService() {
		return greetingService;
	}




	public String getGreeting() {
		
		return greetingService.sayGreeting();
		
	}
	
}
