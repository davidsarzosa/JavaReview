package com.neotech.review01;

import java.util.*;

public class LogicalOperator {

	// Ask the user to enter the age
	// If age is 0 --> You are a newborn
	// If age is from 1 to 3 --> You are a baby
	// If age is from 4 to 5 --> You are a toddler
	// If age is from 6 to 12 --> You are a kid
	// If age is from 13 to 19 --> You are a teenager
	// If age >= 20 --> You are an adult

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Tell me your age ? ");
		int age = myScanner.nextInt();

		String result;
		if (age == 0) {
			result = "You are a newborn";
		} else if (age >= 1 && age <= 3) {
			result = "You are a baby";
		} else if (age >= 4 && age <= 5) {
			result = "You are toddler";
		} else if (age >= 6 && age <= 12) {
			result = "You are a kid ";
		} else if (age >= 13 && age <= 19) {
			result = "You are a teenager";
		} else if (age >= 20) {
			result = "You are an adult";
		} else {
			result = " You are an alien";
		}

		System.out.println(result);
		myScanner.close();

	}

}
