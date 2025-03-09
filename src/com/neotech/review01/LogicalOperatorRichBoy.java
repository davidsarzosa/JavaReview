package com.neotech.review01;

import java.util.*;

public class LogicalOperatorRichBoy {

	public static void main(String[] args) {

		// If you are a boy
		// If you are rich -- Buy a Ferrari
		// otherwise -- Play soccer

		// If you are a girl
		// If you are rich -- Buy a LV bag
		// otherwise -- Read a book

		// If you are none
		// Invalid gender

		// System.out.println("My way to handle things");

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please tell me your gender M/F ? ");
		char gender = myScanner.next().charAt(0);

		System.out.println("Are you rich ? ");
		boolean areRich = myScanner.nextBoolean();
//
//		if (gender == 'M' && areRich) {
//			System.out.println("Buy a Ferrari");
//		} else if (gender == 'M' && !areRich) {
//			System.out.println("Study Java");
//		} else if (gender == 'F' && areRich) {
//			System.out.println("Buy a LV bag");
//		} else if (gender == 'F' && !areRich) {
//			System.out.println("Read a book ");
//		} else {
//			System.out.println("Invalid Gender");
//		}

		System.out.println("chatGPT example using Ternary Operator ");

		String result;

		if (gender == 'M') {
			result = areRich ? "Buy a Ferrari " : "Play soccer";

		} else if (gender == 'F') {
			result = areRich ? "Buy a LV bag " : "Read a book";

		} else {
			result = "Invalid gender";
		}

		// Print only one result

		System.out.println(result);

		// Close scanner to avoid resource leak

		myScanner.close();

	}

}
