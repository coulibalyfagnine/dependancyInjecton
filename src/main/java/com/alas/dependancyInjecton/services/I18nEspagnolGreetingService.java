package com.alas.dependancyInjecton.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("ES")
@Service("I18nGreetingService")
public class I18nEspagnolGreetingService implements IGreetingService{

	@Override
	public String sayGreeting() {
		return "Holla que tal ? -ES profil" ;
	}

}
