package com.neotech.review05;

public class TestBora {
	public static void main(String[] args) {

		Bora b = new Bora();
		b.addTwoNumbers();
		b.addtwoNumbersThatGive(7, 8);

		int result1 = b.addTwoNumbersAndGiveMeTheResult();
		if (result1 == 5) { // in this case the result is comming from the method and is equal to 5
			System.out.println("Good Job Bora");
		} else {
			System.out.println("Dont worry its okay, they still will hire you");
		}

		// You can print directly the return from the method with the parameters
		System.out.println(b.addTwoNumbersThatGiveAndGiveMeTheResult(65, 5621));
		// how many times as you want
		System.out.println(b.addTwoNumbersThatGiveAndGiveMeTheResult(87, 21));
		

	}
}
