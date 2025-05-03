package com.neotech.review09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIntro {

	public static void main(String[] args) {

		// List in an Interface
		// ArrayList and LinkedList are 2 classes implementing the List Interface

		List<String> africa1 = new ArrayList<>();

		africa1.add("Marocco");
		africa1.add("Senegal");
		africa1.add("Kenya");
		africa1.add(1, "Nigeria"); // Adding to the list with an index
		// africa1.add(20); // Compile-time error Cannot store an Integer
		System.out.print("Africa1 --> " + africa1);
		System.out.println();

		// 2nd way of filling and ArrayList
		List<String> africa2 = new ArrayList<>();
		africa2.addAll(africa1);
		System.out.print("Africa2 --> " + africa2);
		System.out.println();

		// 3rd way to filling an Array
		List<String> africa3 = new ArrayList<>(africa1);
		for (int i = 0; i < africa3.size(); i++) {
			String country = africa3.get(i);
			// System.out.print(africa3.get(i) + " ");
			System.out.print(country + " ");
		}
		System.out.println();
		System.out.println("--------ITERATOR-------------");

		Iterator<String> it = africa1.iterator();
		while (it.hasNext()) {
			String country = it.next();
			System.out.print(country + " ");
		}
		System.out.println();

	}

}
