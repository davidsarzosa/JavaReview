package com.neotech.review02;

public class SumEvenOddForLoop {

	public static void main(String[] args) {

		// I want you to add the EVEN & ODD numbers from 1 to 20 and also do a total sum

		int evenSum = 0;
		int oddSum = 0;
		int totalSum = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0)
				evenSum += i;

			else {
				oddSum += i;

			}

			totalSum += i;

		}

		System.out.println("evenSum" + " " + evenSum);
		System.out.println("evenSum" + " " + oddSum);
		System.out.println("evenSum" + " " + totalSum);

		System.out.println("==============Practice================");

		// I want you to add the EVEN & ODD numbers from 100 to 1 and also do a total
		// rest

		int restEven = 0;
		int restOdd = 0;
		int restTotal = 0;

		for (int r = 100; r >= 1; r--) {
			if (r % 2 == 0) {
				restEven += r;
			} else {
				restOdd += r;
			}
			restTotal += r;
		}
		
		
		System.out.println("Even Rest" + " " + restEven);
		System.out.println("Odd est" + " " + restOdd);
		System.out.println("Total Rest" + " " + restTotal);
		
		
		
		
		
		
		

	}

}
