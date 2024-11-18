
package com.srikar.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//This will tell Spring framework that it has to manage this class
@Component
public class Alien {
	
	//There is no context here unlike in the main function, so we are using autowiring to connect the alien and the laptop classes
	@Autowired
	Laptop laptop;
	
	public void code() {
		laptop.compile();
		System.out.println("Coding");
	}
}
