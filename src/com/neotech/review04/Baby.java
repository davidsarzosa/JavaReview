package com.neotech.review04;

public class Baby {

	// variables/ attributes / properties

	String name;
	String gender;
	String weight;
	String hairColor;

	// methods/ behaviors/actios

	void talk() {
		System.out.println(name + "is talking");
	}

	void eat() {
		System.out.println(name + "is eating");
	}

	void cry() {
		System.out.println("is crying");
	}

	void displayInformation() {
		System.out.println("My name is " + name);
		System.out.println("My gender is " + gender);
		System.out.println("My weight is " + weight);
		System.out.println("My hair color is " + hairColor);
	}

}
