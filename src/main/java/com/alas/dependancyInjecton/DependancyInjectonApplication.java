package com.alas.dependancyInjecton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import com.alas.dependancyInjecton.controller.ConstructorInjectedController;
import com.alas.dependancyInjecton.controller.I18nController;
import com.alas.dependancyInjecton.controller.MyController;
import com.alas.dependancyInjecton.controller.PropertyInjectedController;
import com.alas.dependancyInjecton.controller.SetterInjectedController;
import com.alas.dependancyInjecton.services.GreetingServiceImpl;

@SpringBootApplication
public class DependancyInjectonApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependancyInjectonApplication.class, args);
		
		System.out.println("--------------PRIMARY");
		MyController myController =(MyController) ctx.getBean("myController");
		
		System.out.println(myController.getGreeting() );
		
		System.out.println("--------------property");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("--------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("--------------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedController.getGreeting());
		
		
		System.out.println("------------------ Profil: ");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());
		
		
		
	}

}
