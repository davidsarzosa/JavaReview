package com.neotech.review01;

import java.util.*;

public class CalculatorClassPractice {

	public static void main(String[] args) {

		Scanner David = new Scanner(System.in);
		System.out.println("Enter the first number please :");
		double d1a = David.nextDouble();

		System.out.println("Enter the second number please :");
		double d2a = David.nextDouble();

		System.out.println("Please enter what operation would you like to do +, -, *, / ? ");
		String operator1 = David.next();

		double result2 = 0;

		if (operator1.equals("+")) {
			result2 = d1a + d2a;

		} else if (operator1.equals("-")) {
			result2 = d1a - d2a;
		} else if (operator1.equals("*")) {
			result2 = d1a * d2a;
		} else if (operator1.equals("/")) {
			result2 = d1a / d2a;
		} else {
			System.out.println("Invalid Operator");

		}

		System.out.println("The result is = " + result2);
		System.out.println();
		System.out.println("==========================================");
		System.out.println();

		// Ask the user to enter 2 numbers
		// Ask the user for the operator (+,-,*,/)
		// Solve it using if-else

		Scanner Alejandro = new Scanner(System.in);
		System.out.println("Please enter first number ? ");
		double d1 = Alejandro.nextDouble();

		System.out.println("Please enter the second number");
		double d2 = Alejandro.nextDouble();

		System.out.println("Please enter Operator ? ");
		String operator = Alejandro.next();

		double result = 0;
		System.out.println("==========================================");
		// Using SWITCH CASE

		switch (operator) {
		case "+":
			result = d1 + d2;
			break;
		case "-":
			result = d1 - d2;
			break;
		case "*":
			result = d1 * d2;
			break;
		case "/":
			if (d2 == 0) {
				System.out.println("Error : Division by zero is not allowd ");
				Alejandro.close();
				break;

			}
			result = d1 / d2;
			break;

		default:
			System.out.println("Invalid Operator ");
			Alejandro.close();
			return;

		}

		System.out.println("The result for this operation is = " + result);
	}

}
