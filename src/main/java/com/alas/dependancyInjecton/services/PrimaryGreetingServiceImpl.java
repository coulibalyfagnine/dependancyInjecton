package com.alas.dependancyInjecton.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements IGreetingService {

	@Override
	public String sayGreeting() {
		
		return  "Primary : ani sôgôman anka môgô";
	}

}
