package com.neotech.review08_Polymorphisim;

//Every class by defaul extends the Object class

public class Human {

	// fields / variables

	String name; // instance variable
	static String planet; // class variable

	public Human() {
		System.out.println("A human is being created... ");
	}

	public Human(String name) {
		this();
		this.name = name;

	}
	
	// behavior/ method 
	public void talk() {
		System.out.println("bla bla bla ");
	}
	

}
