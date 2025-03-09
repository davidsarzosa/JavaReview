package com.neotech.review01;

import java.util.*;

public class LogicalOperatorPractice {

	// Ask the user to enter the age
	// If age is 0 --> You are a newborn
	// If age is from 1 to 3 --> You are a baby
	// If age is from 4 to 5 --> You are a toddler
	// If age is from 6 to 12 --> You are a kid
	// If age is from 13 to 19 --> You are a teenager
	// If age >= 20 --> You are an adult

	public static void main(String[] args) {

		Scanner Mateo = new Scanner(System.in);
		System.out.println("Please Mateo enter your age ? ");
		int age = Mateo.nextInt();

		String result;

		if (age == 0) {
			// System.out.println("");
			result = "You are a newborn";
		} else if (age >= 1 && age <= 3) {
			// System.out.println("");
			result = "You are a baby";
		} else if (age == 4 || age == 5) {
			// System.out.println("");
			result = "You are a toddler";
		} else if (age >= 6 && age <= 12) {
			// System.out.println("");
			result = "You are a kid";
		} else if (age >= 13 && age <= 19) {
			// System.out.println("");
			result = "You are a teenager";
		} else if (age >= 20) {
			// System.out.println(" ");
			result = "You are an addult";
		} else {
			// System.out.println(" ");
			result = "You are an Ovni";
		}

		System.out.println(result);

		System.out.println("==========================================================");
		Scanner Adrian = new Scanner(System.in);
		System.out.println("Please tell me how many girl friends have you had have?");
		int gf = Adrian.nextInt();

		String result2;

		if (gf == 0) {
			result2 = "I do not belive you";
		} else if (gf <= 1 && gf >= 5) {
			result2 = "Yeah This is normal for you";
		} else if (gf == 6 || gf == 7) {
			result2 = "Yeah this is not a suprise for me";
		} else if (gf <= 8 && gf >= 15) {
			result2 = "Becarefull please use protection and start going to therapy";
		} else if (gf <= 16 && gf >= 25) {
			result2 = "You need to get tested as soon as posible";
		} else {
			result2 = "You are a sick person, you need Jesus";
		}

		System.out.println(result2);
	}

}
