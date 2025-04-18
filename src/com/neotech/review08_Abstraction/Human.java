package com.neotech.review08_Abstraction;

// Abstract class has to be check in the CHATGPT SOURCE and check conditions and behaviors 

public abstract class Human {

	// declaring here

	String name, planet;

	// some behaviors as a normal human

	public Human(String name) {
		this.name = name;

	}

	// Method is declared, but not implemented

	// also it's being call as a abstract method

	public abstract void talk();// unimplemented method

	{

	}

	public void sleep() {
		// implemented method, has a method body

		System.out.println("Every human sleeps the same. "); // this is the body method

	}

}
