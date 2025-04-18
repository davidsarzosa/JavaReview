package com.neotech.review07;

public class HospitalApplication {

	public static void main(String[] args) {

		Doctor d1 = new Doctor("Adrian", 250000, "UIO4567");
		d1.checkUp("Xavier");

		// These are variables and methods of the child class
		// d1.dermId;
		// d1.applySkinTreatment();

		System.out.println("--------------------------------");

		// not possible because constructors are NOT inherited
		//Dermatologist d2 = new Dermatologist();

		// Creating a Dermatologist with NO initial information
		Dermatologist d3 = new Dermatologist();
		d3.name = "Teran";
		d3.salary = 350000;
		d3.licenceId = "UIO 8844";
		d3.dermId = "UIO-DERM 8844";

		d3.checkUp("Maelito");
		d3.applySkinTreatment();

		System.out.println("--------------------------------");

		// Creating a Dermattologist with 4 Parameters
		Dermatologist d4 = new Dermatologist("Chapatin ", 325000, "UIO 0212", "UIO-DERM 0212");
		d4.name = "Chapatin";
		d4.checkUp("Consuelo");
		//d4.applySkinTreatment();

		// The constructors are Not ingerited
		// Dermatologist d5 = new Dermatologist("Roman", 15000, "ATX4488");
		
		
		
	}

}
