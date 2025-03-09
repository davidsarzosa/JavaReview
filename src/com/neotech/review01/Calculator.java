package com.neotech.review01;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		// Ask the user to enter 2 numbers
		// Ask the user for the operator (+,-,*,/)
		// Solve it using if-else

		System.out.println("Please enter the first number: ");
		Scanner Carolina = new Scanner(System.in);
		double d1 = Carolina.nextDouble();

		System.out.println("Please enter the second number ");
		double d2 = Carolina.nextDouble();

		System.out.println("Please enter the operator (+, -, /, *)");
		String operator = Carolina.next();

		double result = 0; // (( DOUBLE RESULT WILL BE DOING THE OPERATION ))

//		if (operator.equals("+")) {
//			// System.out.println(d1 + d2);
//			result = d1 + d2;
//		} else if (operator.equals("-")) {
//			// System.out.println(d1 - d2);
//			result = d1 - d2;
//		} else if (operator.equals("/")) {
//			// System.out.println(d1 / d2);
//			result = d1 / d2;
//		} else if (operator.equals("*")) {
//			// System.out.println(d1 * d2);
//			result = d1 * d2;
//		} else {
//			System.out.println("Invalid operator");
//
//		}

		// This is a different way to do the task
		result = d1 + d2;
		result = d1 - d2;
		result = d1 / d2;
		result = d1 * d2;
		if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")) {
			System.out.println("The result is --- > " + result);
		} else {
			System.out.println("Invalid Input");
		}

		System.out.println("=========================================================================");
		System.out.println("This is an example of how to do this with Switch Case ");

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
				System.out.println("Eror : Division by zero is not allowd. ");
				Carolina.close();
				return;
			}
			result = d1 / d2;
			break;

		default:
			System.out.println("Invalid Operator ");
			Carolina.close();
			return;

		}

		System.out.println("Display the Result " + result);

	}

}
