package com.alas.dependancyInjecton.controller;

import com.alas.dependancyInjecton.services.IGreetingService;

public class PropertyInjectedController {
	
	public IGreetingService greetingServiceImpl;
	
	public String getGreeting() {
		
		return greetingServiceImpl.sayGreeting();
	}
}
