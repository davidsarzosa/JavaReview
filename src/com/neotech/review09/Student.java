package com.neotech.review09;

public class Student {

	String name;

	public Student(String name) {

		this.name = name;

	}

	public void studentInfo() {
		System.out.println("The student name is --> " + name);
	}

	// This mehotd overrides the Object.toString() method.
	// This method will construct as a String representation of an Object
	// want to see when you print the object ?

	
	public String toString() {
		return name;

	}

}
