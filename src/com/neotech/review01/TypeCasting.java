package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {

		// byte < short < int < long < float < double

		int intNumber = 81;
		double doubleNumber = intNumber;

		// widening / implicit casting / automatically
		System.out.println("intNumber -->" + intNumber);
		System.out.println("doubleNumber -> " + doubleNumber);

		// narrowing / explicit casting / manually
		byte byteNumber = (byte) intNumber; // This is RISKY you MAY lose data
		System.out.println("byteNumber" + byteNumber);

		// re -assigning
		intNumber = 450;

		// in this case yoou will lose data
		byte b2 = (byte) intNumber;
		System.out.println("b2 --> " + b2);

		// widening / implicit casting / automatically
		byte b3 = 50;
		int i3 = b3;
		System.out.println("i3 --> " + i3);

		// narrowing / explicit casting / manualy

		double d1 = 7.9999;
		int i4 = (int) d1;
		System.out.println("i4 --> " + i4);

	}

}
