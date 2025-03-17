package com.neotech.review02;

public class SwitchWithMissingBrakes {

	public static void main(String[] args) {

		int number = 1;

		switch (number) {
		case 3:
			System.out.println("3");
			// break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			// System.out.println("5");
		case 6:
			System.out.println("6");
			break;
		case 7:
			// System.out.println("7");
		default:
			System.out.println("The number was not 3, 4, 5, 6, 7");

		}

		// Limitations of switch
		// 1. You cannot have duplicate cases
		// 2. You cannot have logical operators like in if-else

		// 3. You cannot have logical operators like in if-else

		if (number == 5 || number == 6) {

		}
		// OR use greater than
		if (number > 10) {

		}

		// 4 You cannot use double

		double d = 2.5;
		if (d == 3.5) {

		} else {

		}

	}

}
