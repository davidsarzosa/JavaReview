package com.neotech.review10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {
	// Map
	// HashMap || LinkedHashMap || TreeMap || HashTable

	public static void main(String[] args) {

		Map<Integer, String> phonebook = new HashMap<>();

		phonebook.put(65432154, "Brad Pitt");
		phonebook.put(54256381, "Donal Trump");
		phonebook.put(96385274, "Joe Biden");
		phonebook.put(85264562, "Brad Pitt ");
		phonebook.put(12135457, "Taylor Swift");

		// It will replace Taylor Swift with Paul
		phonebook.replace(12135457, "Paul");

		// Another way to replace it
		// phonebook.put(12135457, "Paul");
		System.out.println("The size of my phonebook is --> " + phonebook.size());

		// Map is one-directional, from the KEY to VALUE
		// There is NO way to go from the value to the key

		String name = phonebook.get(12135457);
		System.out.println(name + " is calling...");

		name = phonebook.get(111);
		System.out.println(name + " is calling...");

		boolean containsK = phonebook.containsKey(12135457);
		System.out.println("The phonebook contains 12345678 --> " + containsK);

		boolean containsV = phonebook.containsValue("Taylor Swift");
		System.out.println("Taylor Swift is in my phonebook --> " + containsK);
		boolean containsV2 = phonebook.containsValue("Paul");
		System.out.println("Taylor Swift is in my phonebook --> " + containsV2);

		phonebook.remove(12135457); // Will remove the pair/entry from the map
		System.out.println("The size of my phonebook is --> " + phonebook.size());
		
		// YOU CANNOT ITERATE THE MAP 
		// We need to use keySet(); method to be able to get the values and iterate them
		Set<Integer> numbers = phonebook.keySet();
		Iterator<Integer> itNums = numbers.iterator();
		while (itNums.hasNext()) {
			Integer number = itNums.next();
			// Find the name/value by using the number/key
			String personName = phonebook.get(number);
			System.out.println(number + "<-->" + personName);
		}

		// Get the values and iterate them using an enganced gor loop
		// Try to get the number by using the name!!
		
	}

}
