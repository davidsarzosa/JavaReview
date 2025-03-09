package com.neotech.review01;

import java.util.*;

public class NestedIfRichBoy {

	// If you are a boy
	// If you are rich -- Buy a Ferrari
	// otherwise -- Play soccer

	// If you are a girl
	// If you are rich -- Buy a LV bag
	// otherwise -- Read a book

	// If you are none
	// Invalid gender

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("What is your gender ? M/F ");
		char gender = myScanner.next().charAt(0);
		System.out.println("Are you rich ? ");
		boolean isRich = myScanner.nextBoolean();
		

		if (gender == 'M' || gender == 'm') {
			System.out.println("Yay! it is a boy ");

			if (isRich) {
				System.out.println("You can buy a Ferrari");
			} else {
				System.out.println("You can play soccer ");
			}

		} else if (gender == 'F' || gender == 'f') {
			System.out.println("Oh no! It is a girl! ");
			if (isRich) {
				System.out.println("You can buy a LV bag");
			} else {
				System.out.println("You can read a book ");
			}
		} else {

			System.out.println("invalid gender");
			
			System.out.println("");
			myScanner.close();

		}
	}
}
