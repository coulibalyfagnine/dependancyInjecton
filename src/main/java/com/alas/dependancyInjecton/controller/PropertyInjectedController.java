package com.alas.dependancyInjecton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.alas.dependancyInjecton.services.IGreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	public IGreetingService greetingServiceImpl;
	
	public String getGreeting() {
		
		return greetingServiceImpl.sayGreeting();
	}
}
