package com.neotech.review07;

public class Dermatologist extends Doctor {

	String dermId;

	// The default constructor is declaed implicity by the compiler
	Dermatologist() {
		// super()
		// The default super constructor is being implicity called
	}
	// The constructors are NOT inherited

	Dermatologist(String name, int salary, String licenceId, String dermId) {

		// super(name, salary, licenceId);
		// super.name = name;
		// super salary = salary;

		this.dermId = dermId;

	}

	public void applySkinTreatment() {
		System.out.println("Doctor " + name + " Appliest skin treatment");
	}

}