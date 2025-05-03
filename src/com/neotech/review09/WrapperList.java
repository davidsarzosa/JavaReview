package com.neotech.review09;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperList {

	public static void main(String[] args) {

		// ArrayList can only store objects/ classes
		// ArrayList<int> numbers = new ArrayList<>(); THIS IS NOT POSSIBLE

		ArrayList<Integer> numbers = new ArrayList<>(); // An Array List its being created

		numbers.add(4); // AutoBoxing here as well
		boolean isEmpty = numbers.isEmpty(); // THIS WILL RETURN A BOOLEAN
		System.out.println("Is empty ? " + isEmpty);
		System.out.println("The size is " + numbers.size());

		numbers.add(new Integer(9)); // This is the long way
		numbers.add(5); // this is the easy way AutoBoxing
		numbers.add(2);
		numbers.add(10);

		System.out.println("The size is " + numbers.size());
		System.out.println(numbers);
		System.out.println("--------------------------------");

		boolean contains = numbers.contains(4);
		System.out.println("does the list contain the number 4? " + contains);
		numbers.remove(4);
		System.out.println(numbers);
		System.out.println("--------------------------------");

		System.out.println("How can I iterate the ArrayList ? ");
		System.out.println("1ST WAY");
		for (int i = 0; i < numbers.size(); i++) {
			int element = numbers.get(i); // Auto - UnBoxing
			// UNBOXING is when from an object to an int
			System.out.print(element + " ");
		}
		System.out.println("2ND WAY");
		System.out.println("Using the enhanced for loop");

		for (int element : numbers) {
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println("3RD WAY");
		System.out.println("Using the iterator ");

		Iterator<Integer> iteratorn = numbers.iterator();
		while (iteratorn.hasNext()) {
			int element = iteratorn.next();
			{
				System.out.print(element + " ");
			}
		}

		// there is only 3 methods in the iterator class

	}

}
