package com.neotech.review08_PracticeProject1;

public interface Animal {
	// We provide some some behaviors to the interface Animal
	void makeSound();

	int getAge();

}

// We are creating an abstract class Pet 

abstract class Pet implements Animal {
	// this class Pet has its owns attributes/ variables
	String name;
	int age;

	Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayInfo() {
		System.out.println("This pet name is " + name + " and is " + age + " years old ");
	}

	public int getAge() {
		return age; // when ever you have a method with INT, STRING, BOOLEAN, you MUST return that
					// value

	}

}

// Subclasses 

class Dog extends Pet {

	Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Woff woff!! awrrrr!! ");
	}

}

class Cat extends Pet {

	Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Meow!!! Meeeeeooowww!!! ");
	}

}

class Bird extends Pet {

	Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Tweeeettt!!, Tweeeeeeett!! ");
	}
		
}










