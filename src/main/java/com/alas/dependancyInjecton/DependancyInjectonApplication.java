package com.alas.dependancyInjecton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import com.alas.dependancyInjecton.controller.MyController;

@SpringBootApplication
public class DependancyInjectonApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependancyInjectonApplication.class, args);
		
		MyController myController =(MyController) ctx.getBean("myController");
		
		System.out.println(myController.sayHello() );
	}

}
