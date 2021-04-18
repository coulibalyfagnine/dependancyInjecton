package com.alas.dependancyInjecton.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18nGreetingService")
public class I18nEnglishGreetingService implements IGreetingService{

	@Override
	public String sayGreeting() {
		return "Hello world -EN profil" ;
	}

}
