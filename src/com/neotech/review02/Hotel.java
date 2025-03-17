package com.neotech.review02;

public class Hotel {

	// In my hotel I have 4 floors
	// In each floor I have 6 rooms
	// Room numbers in floor 1 are 1.1 1.2 1.3 1.4 1.5 1.6
	// Room numbers in floor 2 are 2.1 2.2 2.3 2.4 2.5 2.6
	// I want to print all the room numbers

	public static void main(String[] args) {

		for (int floor = 1; floor <= 6; floor++) {

			System.out.println("Floor --> " + floor);

			for (int room = 1; room <= 6; room++) {
				System.out.println("floor" + "." + room + " ");

			}

			System.out.println();// bring me to the next line

		}

		System.out.println("===================================");

		// lets do a different example:

		// I have 4 parking loots each one with 10 cars
		// I want to print all the cars from the 2 parking lots

		for (int parkingLot = 1; parkingLot <= 4; parkingLot++) {
			System.out.println("Parking loot --> " + parkingLot);

			for (int car = 1; car <= 10; car++) {
				System.out.println("car# " + car + " ");
			}
			System.out.println(); // this will be a separation line
		}

	}

}
