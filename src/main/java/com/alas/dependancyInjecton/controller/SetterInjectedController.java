package com.alas.dependancyInjecton.controller;

import com.alas.dependancyInjecton.services.IGreetingService;

public class SetterInjectedController {
	
	private IGreetingService greetingService;
	
	
	public void setGreetingService(IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
		
	}

}
