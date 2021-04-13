package com.alas.dependancyInjecton.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.alas.dependancyInjecton.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

	private SetterInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImpl());
		
	}
	
	

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
