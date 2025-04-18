package com.neotech.review07;

// Method Overloading: The name of the methods MUST be the same
// Method Signature: Method name + Parameters (MUST be unique)

// Access modifier is NOT part of Method Signature
// Return type is NOT part of Method Signature
// Static keyword is NOT part of Method Signature

public class Multiplication {

	public static void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);

	}

	// Is method overloading if this method is not Static ? YES!
	// Is method overloading if this method is private? YES!

	public static void multiply(double db1, double db2) {
		double result = db1 * db2;

	}

	// this is protected method overloading

	private static int multiply(int[] numbers) {
		int result = 1; //
		for (int num : numbers) {
			result *= num;
		}

		return result;

	}

	public static void main(String[] args) {

		Multiplication.multiply(34, 67); // We don't need to specify the class name
		multiply(4, 3);
		multiply(34.56, 96.4); // 2 method with doubles

		int[] array = { 4, 3, 2, 5, 6 }; // JAVA knows because of the method signature.
		int result = multiply(array); // We are passing the parameter (int []) so Java knows there is matching
		System.out.println("Array multiplication result --> " + result);

	}

}
