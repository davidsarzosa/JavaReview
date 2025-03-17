package com.neotech.review03;

public class CountingBackwards {

	public static void main(String[] args) {

		// 4321
		// 4321
		// 4321
		// 4321

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("--------------");
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("--------------");

		// Same patter different solution

		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.print(5 - col);
			}
			
			System.out.println();
		}
		

	}

}
