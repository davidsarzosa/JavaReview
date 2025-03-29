package com.neotech.review05;

public class FamilyDemo {

	public static void main(String[] args) {

		// I can access static/class variables before I create a object

		FamilyMember.lastName = "Messi";

		// I CANNOT access instance variable before I create an object
		// FamilyMember.firstname = "Lionel";

		// I CAN access static/ class methods before I create an object
		FamilyMember.printFamilyName();

		// I CANNOT access instance methods before I create an object
		// FamilyMember.printFullName();

		System.out.println("--------------------------------");

		FamilyMember member1 = new FamilyMember();
		member1.firstName = "Lionel ";
		member1.age = 32;
		System.out.println("--------------------------------");

		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Antonella ";
		member2.age = 35;
		System.out.println("--------------------------------");

		member1.printFullName();
		member2.printFullName();
		System.out.println("--------------------------------");

		System.out.println("They went to court and changed their lastname!!!");
		// Static variables CAN change
		FamilyMember.lastName = "GOAT";
		member1.firstName = "Leo ";

		member1.printFullName();
		member2.printFullName();
		System.out.println("--------------------------------");

		// They are making a baby

		FamilyMember baby = new FamilyMember();

		// Does the baby have a firstName ?
		System.out.println("Baby fristName --> " + baby.firstName);

		// Does the baby have a lastName >
		System.out.println("Baby lastName --> " + FamilyMember.lastName);

	}

}
