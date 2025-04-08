package com.neotech.review06;

import java.util.Arrays;

public class ArrayParameter {

	public static void main(String[] args) {

		int[] array = { 3, 6, 9, 0, 1, 15 };
		int[] array2 = { 54, 65, 54, 32, 32, };
		// To ptint one elmenet from the array, with index 1
		// System.out.println(array[1]);
		// System.out.println(array.length);

		String str = Arrays.toString(array);
		System.out.println(str);
		String str2 = Arrays.toString(array2);
		System.out.println(str2);

		ArrayParameter ap = new ArrayParameter();

		int result = ap.largestNumber(array);
		System.out.println("the largest of first array is --> " + result);
		int result2 = ap.largestNumber(array2);
		System.out.println("the largest of second array is --> " + result2);
		int resultSum1 = ap.arraySum(array);
		System.out.println("the sum of the first array is " + resultSum1);
		int resultSum2 = ap.arraySum(array2);
		System.out.println("the sum of the second array is " + resultSum2);
		double avg1 = ap.arrayAvg(array);
		System.out.println("the avg sum of the first array is " + avg1);
		double avg2 = ap.arrayAvg(array2);
		System.out.println("the avg sum of the second array is " + avg2);

	}

	// This is a task, based on that task we will do some exercises
	// to understand better how Array parameter works

	// input --> int[] (an array of integers)
	// logic --> given an array, find the largest number
	// output --> int (the largest number)
	// usage --> non - static (You need an object to execute the method )

	public int largestNumber(int[] arr) {
		int largest = arr[0];

		for (int el : arr) {
			if (el > largest) {
				largest = el;
			}
		}
		return largest;
	}

	protected int arraySum(int[] arr) {
		int sum = 0;
		for (int el : arr) {
			sum += el;
		}
		return sum;
	}

	private double arrayAvg(int[] arr) {
		// Can I use the arraySum() method to find the sum of the array ? - YES
		double sum = arraySum(arr); // up- casting - automatically
		double avg = sum / arr.length;
		return avg;

	}

}
