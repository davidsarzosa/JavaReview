package com.neotech.review02;

import java.util.Scanner;

public class CalculatorSwitch {

	// Ask the user to enter 2 numbers
	// Ask the user for the operator (+,-,*,/)
	// Solve it using switch-case

	public static void main(String[] args) {

		String operator = " ";
		int num1;
		int num2;

		Scanner Paola = new Scanner(System.in);
		System.out.println("Enter first number : ");
		num1 = Paola.nextInt();
		System.out.println("Enter the second number : ");
		num2 = Paola.nextInt();
		System.out.println("Enter operator you need : +,-,*,/ ");
		operator = Paola.next();

		int result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;

			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("Error: cannot divide by zero");
				Paola.close();
				return;
			}
			result = num1 / num2;
			break;

		default: {

			System.out.println("Wrong operator");

		}

		}

		System.out.println("The result is = " + result);

		// there is another way to do this
		// System.out.println("==========================================");

		double num3;
		double num4;

		System.out.println("Enter your thirt number :");
		num3 = Paola.nextDouble();
		System.out.println("Enter your forth number :");
		num4 = Paola.nextDouble();
		System.out.println("Enter the operator you need :");
		operator = Paola.next();
		double result2 = 0;

		switch (operator) {
		case "+":
			result2 = num3 + num4;
			break;
		case "-":
			result2 = num3 - num4;
			break;
		case "*":
			result2 = num3 * num4;
			break;
		case "/":
			if (num4 % 2 == 0) {
				System.out.println("Error: cannot divide by zero");
			}

			result2 = num3 / num4;
			break;

		default:
			System.out.println("Wrong operator");

		}

		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
			System.out.println("This is result: " + result2);
		}

		Paola.close();
	}

}
