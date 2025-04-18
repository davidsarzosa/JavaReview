package com.neotech.review07;

public class Forest {

	public static void main(String[] args) {

		// we are creating an object now from class animal

		Animal wolf = new Animal("Wolfy", 4);

		wolf.sleep();
		wolf.displayInfo();
		System.out.println();

		Fox fox = new Fox("Milka", 4, "Orange");
		fox.sleep();
		fox.displayInfo();
		System.out.println();

		Bear ted = new Bear("Ted", 2, "Black");
		ted.sleep();
		ted.displayInfo();
		ted.roar();
		System.out.println();
	}

}
