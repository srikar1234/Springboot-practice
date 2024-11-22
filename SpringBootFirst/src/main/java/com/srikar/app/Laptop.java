package com.srikar.app;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
    public Laptop() {
    	System.out.println("Laptop Object Created");
    }
    
	public void compile() {
		System.out.println("Compiling...");
	}
}