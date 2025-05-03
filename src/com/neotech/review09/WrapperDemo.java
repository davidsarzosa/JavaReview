package com.neotech.review09;

public class WrapperDemo {

	public static void main(String[] args) {

		int num1 = 12;

		// Integer integer1 = new Integer(20); // until JAVA 1.8
		// Integer integer2 = Integer.valueOf(30); // Java 9 and up

		// Easy way

		int num3 = 7;
		Integer integer3 = num3; // AutoBoxing // AutoGrapping // Auto-Converting
		int num4 = integer3; // AutoUnBoxing // AutoUnGrapping // Auto-UnConverting

		// Double Wrapper
		double d1 = 3.5; // this is a normal primitive data-tape declaration
		Double d2 = d1; // Auto Boxing
		double d3 = d2; // Auto Un-Boxing.

		boolean b1 = false; // this is a normal non-primitive declaration
		Boolean b2 = b1; // Auto Boxing
		boolean b3 = b2; // Auto- UnBoxing

		Boolean b4 = true; // Class

		Character c = '%'; // Auto-Boxing

		// int -- > Integer
		// byte --> Byte
		// short --> Short
		// long --> Long
		// float --> Float
		// double -- > Double
		// boolean --> Character
		
		
		// BOXING is converting a int into A OBJECT 
		// UNBOXING is converting an object into int
		

	}

}
