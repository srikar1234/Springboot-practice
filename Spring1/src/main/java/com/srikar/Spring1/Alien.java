package com.srikar.Spring1;

public class Alien {
	
	private int age;
	
	private Laptop lap;
	
	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	//Constructor
	public Alien() {
		System.out.println("Object Created!");
	}
	
	public Alien(int age, Laptop laptop) {
		this.age = age;
		this.lap = laptop;
	}
		
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
		lap.compile();
	}
}