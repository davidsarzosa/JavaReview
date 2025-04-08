package com.neotech.review06;

public class Person {

	// instace variables

	public String name;
	int age;
	protected int weigth;
	private char gender;

	public Person() {

	}

	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	public Person(String pName, int pAge, int paramWeigth) {
		name = pName;
		age = pAge;
		weigth = paramWeigth;
	}

	public void displayInfo() {
		System.out.println("Name " + name + " age: " + age + " weigth " + weigth);
	}

}
