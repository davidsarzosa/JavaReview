package com.neotech.review08_Abstraction;

public class World {

	public static void main(String[] args) {

		// We cannot create an object from an abstract class
		// Human h1 = new Human();

		// up-casting and down-casting
		// can ONLY be done because of INHERITANCE

		// up-casting and down-casting
		// can Only be done because of inheritance
		Human a1 = new Albanian("Elion"); // up-casting

		a1.talk(); // this can be access because override
		a1.sleep(); // all behaviors do the same
		// a1.albannianDance(); check with GPT why canNOT be access here ?

		// now is a Turk moment

		Human t1 = new Turkish("Furkan"); // up-casting
		t1.talk();
		// t1.makeBaklava();

		Turkish t2 = (Turkish) t1; // down-casting
		t2.name = "Omar";
		t2.makeBaklava();
		t2.talk();
		t2.sleep();

		// HW for hard-working student
		// Create an array of 5 Humans, and fill it.
		// Iterate the array with an enhanced for loop
		// execute the talk and sleep method for all of them
	}

}
