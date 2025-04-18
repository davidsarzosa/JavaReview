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
		System.out.println("------------------------------");

		// A task for Emin, Umut, Abit and other hard working students
		// Hide all the numbers and leave the last four digits of ssn
		// 345-54-4156

		// this is the task
		System.out.println("------------------------------");

		// "737 32 6479"
		System.out.println("*** **" + ssn.substring(+6, 11));
		System.out.println("------------------------------");

		int[] ssn1 = { 737326479 };

		for (int i = ssn1.length - 1; i > ssn1.length; i++) {
			System.out.print(i);
		}

	}

}
