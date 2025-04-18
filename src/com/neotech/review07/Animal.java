package com.neotech.review07;

public class Animal {

	// Base/Super/Parent class

	String name;
	int legs;

	Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;

	}

	public void sleep() {
		System.out.println("All animals sleep");
	}

	public void displayInfo() {
		System.out.println(name + " has " + legs + " legs");
	}

}

// Deliverd/Sub/Child class
class Fox extends Animal {
	String color;

	Fox(String name, int legs, String color) {

		super(name, legs);
		this.color = color;
	}

}

class Bear extends Animal {

	Bear(String name, int legs, String color) {
		super(name, legs);

	}

	public void roar() {
		System.out.println("All bears roar! ");
		System.out.println(name + " roars! laouder!");
	}

}
