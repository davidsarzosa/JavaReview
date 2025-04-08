package com.neotech.review06;

public class World {

	// 1st way, using the constructor with NO parameter
	public static void main(String[] args) {

		Person p1 = new Person();
		// p1.displayInfo();
		p1.name = "Consuelo";
		p1.age = 56;
		p1.weigth = 80;
		// p1.gender = 'M'; // gender is private

		p1.displayInfo();

		System.out.println("--------------------------------");

		// 2nd Way, using the constructor with TWO parameter

		Person p2 = new Person("Sara", 65);
		// System.out.println(p2);
		p2.weigth = 120;
		p2.displayInfo();

		System.out.println("--------------------------------");

		// 3rd way, using the constructor with THREE parameter

		Person p3 = new Person("Elizabeth", 25, 130);
		p3.displayInfo();
	}
}
