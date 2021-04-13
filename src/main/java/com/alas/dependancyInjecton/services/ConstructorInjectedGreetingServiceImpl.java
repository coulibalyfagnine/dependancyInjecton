package com.alas.dependancyInjecton.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements IGreetingService {
	
	@Override
	public String sayGreeting() {
		
		return "Constructor : ani sôgôman anka môgô";
	}

}
