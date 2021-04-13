package com.alas.dependancyInjecton.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.alas.dependancyInjecton.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.greetingServiceImpl = new GreetingServiceImpl();
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
