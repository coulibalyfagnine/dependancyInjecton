package com.alas.dependancyInjecton.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements IGreetingService {
	
	@Override
	public String sayGreeting() {
		
		return "Property : ani sôgôman anka môgô";
	}

}
