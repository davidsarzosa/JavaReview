package com.neotech.review01;

import java.util.*;

public class ScammerReview {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// next.() read one word untill scape/enter

		/*
		 * System.out.println("Please enter your first name :"); String firstName =
		 * input.next();
		 * 
		 * System.out.println("Please enter your last name : "); String lastName =
		 * input.next();
		 * 
		 * System.out.println("Your full name is-->  " + firstName + " " + lastName);
		 * 
		 * System.out.println("-----------------------------------------------------");
		 */

		// nextLine(); read the whole line until enter
//
//		System.out.println("Please enter your first name :");
//		String firstName = input.nextLine();
//
//		System.out.println("Please enter your last name : ");
//		String lastName = input.nextLine();
//
//		System.out.println("Your full name is-->  " + firstName + " " + lastName);

		System.out.println("-----------------------------------------------------");

//		System.out.println("Please enter an int, boolean, and double ");
//
//		int num = input.nextInt();
//		boolean b = input.nextBoolean();
//		double d = input.nextDouble();
//
//		System.out.println("You entered " + num + " " + b + " " + d);

		System.out.println("-----------------------------------------------------");

		System.out.println("Please enter a long sentence");

		String str1 = input.next(); // This line will stop after the first letter is done
		String str2 = input.next(); // This line will stop after the second letter is done 
		String str3 = input.nextLine(); // this will continue untill the rest of the line is done

		System.out.println("str1 -->" + str1);
		System.out.println("str2 -->" + str2) ;
		System.out.println("str3 -- > " + str3);

		
		
		
		
		
	}

}
