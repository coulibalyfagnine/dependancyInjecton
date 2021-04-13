package com.alas.dependancyInjecton.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	
	public String sayHello() {
		System.out.println("Fotamana");
		
		return "akwaba";
		
	}
}
