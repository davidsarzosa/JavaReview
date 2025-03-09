package com.neotech.review01;

public class TypeCastingPractice {

	public static void main(String[] args) {

		int intNumber = 250;
		double dN = intNumber;
		System.out.println(dN);
		// narrowing / explicit casting / manually

		byte TestNumber = (byte) intNumber;
		System.out.println("byteNumber " + TestNumber);

	}

}
