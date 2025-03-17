package com.neotech.review02;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		// Ask the user to enter a positive number and add it to the total
		// He should enter -1 to STOP. -1 will not be added to the total

		double count = 0;
		double totalSum = 0;

		Scanner myScan = new Scanner(System.in);
//
//		while (count != -1) {
//			System.out.println("Enter a positive numbe , enter -1 to stop");
//			count = myScan.nextDouble();
//			totalSum += count;
//			System.out.println("Your number" + " " + totalSum);
//
//		}
//
//		System.out.println("This is the total sum " + " " + totalSum);
//
//		// More practice
//
//		System.out.println("===============Practice=================");
//
//		// you can do this also with DoWhile
//		// this will be the same but with Letters
//
//		String StopKey = "Stop";
//		String addWord;
//
//		do {
//			System.out.println("Enter any word , enter Stop to stop");
//			addWord = myScan.next();
//			System.out.println("Your vocabulary is wroing --> " + " " + addWord);
//
//		} while (StopKey != "Stop");
//		StopKey += addWord;
//
//		{
//
//			System.out.println("Your final sentence " + " " + addWord);
//		}

		System.out.println("===============Practice=================");

		// We can do this also with a for(loop)
		// Do it using it a Do While

		int num = 0;
		int total = 0;

		do {
			System.out.println("Enter a positive number , enter -1 to stop ");
			num = myScan.nextInt();
			if (num != -1)
				total += num;

		} while (num != -1);

		System.out.println("Total -- > " + total);

		System.out.println("===============Practice=================");

		// Using Scanner and using (for loop )

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}

		System.out.println("===============Practice=================");

		System.out.println("Enter a positive number , enter -1 to stop ");
		num = myScan.nextInt();
		for (; num != -1;) {
			total += num;

			System.out.println("Enter a positive number to stop enter -1");
			num = myScan.nextInt();

		}
		System.out.println("Total = " + total);
	}

}
