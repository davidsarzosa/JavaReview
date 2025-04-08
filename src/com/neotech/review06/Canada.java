package com.neotech.review06;

public class Canada {

	public static void main(String[] args) {

		USA us = new USA();

		System.out.println("Accessing the variables of US  from withing Canada ");

		System.out.println("public --> " + us.BestSchool);
		System.out.println("default --> " + us.state);
		System.out.println("protected -->" + us.mainState);
		// System.out.println("private ---> " + us.capitalCity); // NOT ACCESIBLE
		// BEACUSE PRIVATE

		System.out.println("--------------------------------");

		System.out.println("Accessing the methods from within Canada");

		us.attendNeoTech();
		us.playNBA();
		// us.selectPresident(); f off im a private method.

	}

}
