package com.neotech.review05;

public class ReplaceDemo {

	public static void main(String[] args) {

		String longStr = "Today Im happy because Im going to Ecuador";

		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);

		anotherStr = longStr.replaceAll("[a-z]", "*");
		System.out.println(anotherStr);

		String ssn = "737 32 6479";
		System.out.println(ssn);

		String newSsn = ssn.replaceAll("[0-6]", "#");
		System.out.println(newSsn);

		// Lest remove the dashes form ssn
		String numbers = ssn.replaceAll("-", "");
		System.out.println(numbers);
		
		// A task for Emin, Umut, Abit and other hard working students
		// Hide all the numbers and leave the last four digits of ssn
		// ***-**-4156
		
		

		
	}

}
