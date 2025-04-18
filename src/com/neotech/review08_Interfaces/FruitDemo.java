package com.neotech.review08_Interfaces;

public class FruitDemo {

	public static void main(String[] args) {

		Apple a = new Apple("Red");

		a.wash();
		a.peel();

		Walnut w = new Walnut("Brown");
		w.crack();

		Fruit f = new Apple("Yellow"); // up-casting
		// f.wash();
		// f.peel();

		Apple a2 = (Apple) a; // down - Casting

		a2.wash();
		a2.peel();

		// We cannot create an object from an Interface
		// Peelable p = new Peelable();

		Peelable p2 = new Apple("Green"); // up-casting
		p2.peel();
		// p2.wash(); you CANNOT inherited from your kid
		// wash(); method is not defined in the Peelable Interface

		Apple a3 = (Apple) p2; // down-casting, explicitly
		a3.wash();
		a3.peel();

		// Tasks are only for good students :)

		// Task 1
		// Create an Orange class that extends Fruit and implement Peelable

		// Task 2
		// Create an array of Peelable with 3 elements, one apple and two oranges
		// Iterate the array and execute the peel() method
		// Try to execute wash() method???

	}

}
