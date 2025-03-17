package com.neotech.review02;

public class WhileDemo {

	public static void main(String[] args) {

		// this will be printing 5 times hello

		String hola = "Buenas noches";
		int count = 0; // I do need to check if I'm starting with 0 or 1
		// because that will impact the result

		while (count <= 5) { // if I do < than is not the same that doing <= than

			count++;
			System.out.println(count + " " + hola);

		}

		System.out.println("==============Practice================");
		// Task is Print hello in russian starting from 54 until 64

		String priviet = "Zdrasbuitie! ";
		int num = 54;

		while (num <= 64) { // the (= equal also counts as a number)
			System.out.println(num + " " + priviet);
			num++;

		}

		System.out.println("==============Practice================");

		int count2 = 5;
		while (count2 >= 1) {
			System.out.println(count2 + " " + "Happy mothers day");
			count2--;

		}

		System.out.println("==============Practice================");

		// This one here will be an infinite loop;

		int i = 0;

		while (true) {
			if (i == 6) {
				break;
			}

			System.out.println(i + " " + "halo");
			i++; // we stop the loop making a sum (++)

		}

	}

}
