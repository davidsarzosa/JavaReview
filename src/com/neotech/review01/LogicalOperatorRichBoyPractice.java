package com.neotech.review01;

import java.util.*;

public class LogicalOperatorRichBoyPractice {

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
		System.out.println("Please tell me your gender  F/M ? ");
		char gender = myScanner.next().charAt(0);

		System.out.println("Please tell me if you are rich or not ? ");
		boolean isRich = myScanner.nextBoolean();
		String result;

		if (gender == 'F' && isRich) {
			result = "You are a Rich Girl!! you can buy a LV bag";
		} else if (gender == 'F' && !isRich) {
			result = "You are poor, you can read a book";
		} else if (gender == 'M' && isRich) {
			result = "You are a Rich Guy!! you can buy a Ferrari";
		} else if (gender == 'M' && !isRich) {
			result = "You are a Poor Guy!! you can play Soccer";
		} else {
			result = "Invalid Gender";
		}

		System.out.println(result);
		
		System.out.println("============================================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
