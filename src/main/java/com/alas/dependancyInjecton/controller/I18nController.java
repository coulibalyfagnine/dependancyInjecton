package com.alas.dependancyInjecton.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.alas.dependancyInjecton.services.IGreetingService;

@Controller
public class I18nController {
	
	private final IGreetingService greetingService;
	
	public I18nController(@Qualifier("I18nGreetingService")IGreetingService greetingService) {
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
