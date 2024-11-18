package com.srikar.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext  context = SpringApplication.run(SpringBootFirstApplication.class, args);
		System.out.println("Hello world");
		
		
		//Get the bean/object from the IOC container using application context
		Alien Obj = context.getBean(Alien.class);
		Obj.code();
		
		Alien Obj1 = context.getBean(Alien.class);
	    Obj1.code();
	}

}
