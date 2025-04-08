package com.neotech.review06_outside;

import com.neotech.review06.USA;

public class Mexico {

	public static void main(String[] args) {

		USA us = new USA();
		System.out.println("Accessing the USA(class)variables from within Mexico");

		System.out.println("public --> " + us.BestSchool);
		// System.out.println("default --> " + us.state); // default
		// System.out.println("protected -->" + us.mainState); // protected
		// System.out.println("private ---> " + us.capitalCity); // private

		System.out.println("---------------------------------");
		System.out.println("Accessing the methods from within Mexico");

		us.attendNeoTech();
		// us.playNBA(); // protected
		// us.selectPresident();// private

	}

}
