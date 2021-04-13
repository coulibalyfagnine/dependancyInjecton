package com.alas.dependancyInjecton.controller;

import com.alas.dependancyInjecton.services.IGreetingService;

public class ConstructorInjectedController {
	
	private final IGreetingService greetingService;
	
	
	public ConstructorInjectedController(IGreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	


	public String getGreeting() {
		return greetingService.sayGreeting();
		
	}
}
