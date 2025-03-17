package com.neotech.review03;

public class TwoD_ArrayIntro {
	public static void main(String[] args) {

		int[][] numbers = new int[3][4];

		numbers[1][2] = 7;
		numbers[2][0] = 9;
		numbers[0][0] = 4;
		numbers[0][2] = 5;

		// re-assing a value to one element
		numbers[2][0] += -1; // decrementing by 1

		System.out.println("this is the number of rows " + numbers.length);

		int rows = numbers.length;
		System.out.println("this is also the number of rows "+rows);

		int cols1 = numbers[0].length;
		System.out.println(cols1);

		int[][] numbers2 = {

				{ 7, 8, 2, 4, 1},
				{ 9, 1, 6, 4 }, 
				{ 3, 1, 7, 4 },
				{ 2, 5, 8, 7 },
				{ 13,45,34,9 }
		};
		
		int cols2 = numbers2[0].length;
		System.out.println("the length of the row with index 0 is "+cols2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
