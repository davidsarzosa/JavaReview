package com.neotech.review01;

import java.util.*;

public class NestedIfRichBoyPractice {

	public static void main(String[] args) {

		// If you are a boy
		// If you are rich -- Buy a Ferrari
		// otherwise -- Play soccer

		// If you are a girl
		// If you are rich -- Buy a LV bag
		// otherwise -- Read a book

		// If you are none
		// Invalid gender

		Scanner soul = new Scanner(System.in);
		System.out.println("What is your gender ? ");
		char gender = soul.next().charAt(0);

		System.out.println("Are you rich ? ");
		boolean isRich = soul.nextBoolean();

		if (gender == 'M' || gender == 'm') {
			System.out.println("Yay! it is a BOY!!! ");

			if (isRich) {
				System.out.println("You can buy a Ferrari!! ");
			} else {
				System.out.println("You can play soccer at the park ");
			}
		} else if (gender == 'f' || gender == 'F') {
			System.out.println("Oh! no! it is a Girl!! ");
			if (isRich) {
				System.out.println("You can buy a LV bag");
			} else {
				System.out.println("You can read a book ");
			}
		} else {
			System.out.println("invalid gender");
			System.out.println("");
			soul.close();
		}

	}
}
