package com.srikar.Spring1;

import javax.management.ConstructorParameters;

public class Alien {
	
	private int age;
	private Computer comp;
	
	/*
	 * private Laptop lap;
	 * 
	 * public Laptop getLap() { return lap; }
	 * 
	 * public void setLap(Laptop lap) { this.lap = lap; }
	 */

	//Constructor
	public Alien() {
		System.out.println("Alien object created!");
	}

	/*
	 * //This annotation is used when we want to call the beans by name in the XML
	 * file
	 * 
	 * @ConstructorParameters({"age", "lap"}) public Alien(int age, Laptop laptop) {
	 * this.age = age; this.lap = laptop; }
	 */
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter called");
		this.age = age;
	}

	//Method of class
	public void code() {
		System.out.println("Coding");
		comp.compile();
	}

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}
}