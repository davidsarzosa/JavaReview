package com.neotech.review03;

public class StringArray {

	public static void main(String[] args) {

		String animals[] = { "dog", "cat", "fish", "horse", "goat", };

		// System.out.println(animals.length);

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}

		// advanced/Enhanced for loop (Fancy for loop)

		System.out.println();
		System.out.println("------------------------");
		for (String element : animals) {
			System.out.print(element + " ");
		}

		// The last element's index is --> (length -1)

		System.out.println();
		System.out.println("------------------------");
		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.print(animals[i] + " ");
		}

	}

}
