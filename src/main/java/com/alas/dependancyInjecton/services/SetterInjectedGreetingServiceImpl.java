package com.alas.dependancyInjecton.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceImpl implements IGreetingService {
	
	@Override
	public String sayGreeting() {
		
		return "Setter : ani sôgôman anka môgô";
	}

}
