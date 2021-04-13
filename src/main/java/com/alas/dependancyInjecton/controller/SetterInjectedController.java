package com.alas.dependancyInjecton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.alas.dependancyInjecton.services.IGreetingService;

@Controller
public class SetterInjectedController {
	
	private IGreetingService greetingService;
	
	@Autowired
	public void setGreetingService(@Qualifier("setterInjectedGreetingServiceImpl")IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
		
	}

}
