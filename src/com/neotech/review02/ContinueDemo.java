package com.neotech.review02;

public class ContinueDemo {

	// I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
	// but not 13th birthday, because we are scared
	// Let's use for loop

	public static void main(String[] args) {

		for (int i = 11; i <= 20; i++) {
			if (i == 13)
				continue;
			System.out.println("Furkan's birhday +" + i);
		}

		System.out.println("Same thing using while loop");
		System.out.println("===============================");

		int p = 10;
		while (p < 20) {
			p++;

			if (p == 13) {
				continue;
			}
			System.out.println(" Furkan's Birthday is " + p); // has to be printed inside the loop
		}

		System.out.println(p); // this will just give you final result

	}

}
