package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {

		// Always format your code
		// control + shift + f
		// command + shift + f

		// delcare a variable
		String firstName;

		// System.out.println("My name is -- > " + firstName);

		// Assing a value(initialize)
		firstName = "Sitora";

		System.out.println("My name is -- > \" + firstName");

		// Declare a variavle & Assing a value
		String lastName = "Abduvosieva";

		int age = 20;

		System.out.println(firstName + " " + lastName + " " + age + 1);
		System.out.println(firstName + " " + lastName + " " + (age + 1));

		System.out.println(age);

		// after 10 years
		// re-assing a new value to container

		age += 10;
		lastName = "Pitt";

		System.out.println("After getting maddied! ");
		System.out.println(firstName + " " + lastName);

	}

}
