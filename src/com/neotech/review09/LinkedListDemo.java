package com.neotech.review09;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> asia = new LinkedList<>();

		asia.add("Japan");
		asia.add("China");
		asia.addFirst("China");
		asia.add("Maldives");
		asia.addLast("India");
		asia.add(3, "Turkyie");

		System.out.print("asia -> " + asia);
		System.out.println();

		// Task
		// Iterate the Asia list and remove duplicates
		// hint: you can create a new List, add the elements one by one
		// but first check if the new list CONTAINS the country

		List<String> asia2 = new LinkedList<>();

		for (String country : asia) {
			if (asia2.contains(country)) {
				System.out.println("The country " + country + " exist in the list ");

			} else {
				asia2.add(country);

			}

		}
		System.out.print("Asia2 is --> " + asia2);

	}

}
