package com.neotech.review03;

public class MoreNumberPatterns {

	public static void main(String[] args) {

		// 1
		// 22
		// 333
		// 4444

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-------------------");
		// 1111
		// 222
		// 33
		// 4

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("-------------------");
		// this solution is easier than the other up 
		
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 5 - row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}

	}

}
