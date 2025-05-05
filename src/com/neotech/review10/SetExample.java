package com.neotech.review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	// Collection
	// List | Set | Queue | (Three interfaces inheriting Collection)

	// ArrayList | LinkedList (Two classes implementing List Interface )
	// HashSet | LinkedHashSet | TreeSet (Three classes implementing Set Interface )

	// 1. LIST preserves the insertion order, but SET does NOT!
	// 2. LIST contains duplicates, but SET contains UNIQUE objects

	public static void main(String[] args) {

		Set<String> africaLinked = new LinkedHashSet<>();
		africaLinked.add("Nigeria");
		africaLinked.add("Marocca");
		africaLinked.add("Algeria");
		africaLinked.add("Ghana");
		System.out.println("the size of africa is -- > " + africaLinked.size());
		System.out.println(africaLinked);

		// Because is a SET will not allowed duplicates
		// africaLinked.add("Marocca");
		// System.out.println("the size of africa is -- > " + africaLinked.size());

		// Can I add with an Index to a set ? NO!
		// africaLinked.add(4,"Somalia");
		System.out.println("LinkedHashSet<>() Insertion order" + africaLinked);

		// HashSet --> The order is random
		Set<String> africaHash = new HashSet<>(africaLinked);
		System.out.println("HashSet<>() No Order " + africaHash); // This will give us a random order

		// TreeSet --> Alphabetical Order
		Set<String> africaTree = new TreeSet<>(africaLinked);
		System.out.println("TreeSet<>() Alphabetical order " + africaTree);

		int size = africaTree.size();
		boolean containsMali = africaTree.contains("Mali");
		boolean isEmpty = africaTree.isEmpty();
		boolean ableToRemove = africaTree.remove("Mali");

		System.out.println("Does Africa contains Mali ? " + containsMali);
		System.out.println("Was I able to remove Mali ? " + ableToRemove);
		System.out.println("Is Africa Empty ? " + isEmpty);

		// NOTE we are not able to remove by INDEX in a set why ? Because we do not have
		// a set
		// africaTree.getClass(4); compile error
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----1st way, for loop Does NOT WORK with a SET because there is not INDEX ");
//		for (int i = 0; i < africaTree.size(); i++) {
//				africaTree.get(i);
//		}

		// ITERATE africaTree using enhanced for loop and iterator

		System.out.println("Using an Enhanced For Loop");
		for (String ac : africaTree) {
			System.out.print(ac + " ");
		}
		System.out.println("\n---------------------------");
		System.out.println("Using an Iterator ");
		Iterator<String> it = africaTree.iterator();
		while (it.hasNext()) {
			String af = it.next();
			System.out.print(af + " ");
		}
		
	}
}
