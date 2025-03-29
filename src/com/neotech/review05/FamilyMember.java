package com.neotech.review05;

public class FamilyMember {

	String firstName;
	static String lastName; // static/class variable, belongs to the class
	int age; // instance variable

	// With non-static methods you can access all the variables
	void printFullName() {
		System.out.println("Full name is " + firstName + lastName);
	}

	static void printFamilyName() {
		System.out.println("Family name is " + lastName);
	}

}
