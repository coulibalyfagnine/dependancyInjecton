package com.alas.dependancyInjecton.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {
	
	@Override
	public String sayGreeting() {
		
		return "ani sôgôman anka môgô";
	}

}
