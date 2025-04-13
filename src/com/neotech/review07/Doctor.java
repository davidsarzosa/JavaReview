package com.neotech.review07;

public class Doctor {

// OOP --> Object Oriented Programming 

	// 1. Inheritance (Herencia)
	// 2. Polymorphism
	// 3. Abstraction
	// 4. Encapsulation

	// Every class in Java is extending the Object
	// Object class is like Adam in humanity! :)

	// It is a good practice to declare the default constructor
	String name;
	int salary;
	String licenceId;

	Doctor() {

	}

	Doctor(String name, int salary, String licenceId) {
		this.name = name;
		this.salary = salary;
		this.licenceId = licenceId;

	}

	public void checkUp(String name) {
		System.out.println("Doctor " + this.name + " makes a checkup on " + name);
	}

}
