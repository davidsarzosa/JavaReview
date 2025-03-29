package com.neotech.review05;

public class SplitDemo {

	public static void main(String[] args) {

		String longStr = "I am very happy today because today is not Monday";

		String[] strArray = longStr.split("today");
		System.out.println(strArray.length);

		System.out.println("---Iterating the array using Enhanced for loop -----");
		for (String element : strArray) {
			System.out.print(element);

		}
		System.out.println();

		System.out.println("----Iterating the array using Normal for loop----");
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		System.out.println("--------------------------------");

		longStr = "I like number 5 and 6 because 7 ate 9.";
		// String[] StringArray = longStr.split("[5-7]"); // looking for numbers 5
		// trough 7
		// String[] StringArray = longStr.split("[57]");// looking for numbers 5 and 7
		// and 9
		String[] StringArray = longStr.split("57");
		System.out.println(StringArray.length);

	}

}
