package com.neotech.review03;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		// Ask the user: How many numbers do you want to store in the array?
		// Ask him to enter the numbers: Read numbers and enter them into the array
		// Print the numbers from the array

		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to store in the array?");
		int size = input.nextInt();

		// Declaring the array
		int array[] = new int[size];

		// We need still to ask the user to enter the numbers and store into the array

		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number ? ");
			array[i] += input.nextInt();
		}

		// We still need to print the numbers with a enhanced foor loop

		System.out.println("This are the numbers from the array ");
		for (int number : array) {

			System.out.print(number + " ");
		}
		System.out.println();

		System.out.println("----------------------------------");

		// Ask the user how many world they want to use ?

		System.out.println("How many words do you want to use ?");
		int sizew = input.nextInt();
		input.nextLine();

		// create an array to store the words
		String[] words = new String[sizew];

		// get words from the user

		for (int i = 0; i < sizew; i++) {
			System.out.println("Enter your word");
			words[i] += input.next();
		}
		System.out.println();

		// Get words from the user
		for (int i = 0; i < size; i++) {
			System.out.print("Enter word " + (i + 1) + ": ");
			words[i] = input.nextLine();
		}

		// Print the words stored in the array
		System.out.println("\nYou entered the following words:");
		for (String word : words) {
			System.out.println(word);
		}

		input.close();
	}

}
