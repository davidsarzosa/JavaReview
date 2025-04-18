package com.neotech.review08_Interfaces;

public class Walnut extends Fruit implements Crackable {

	public Walnut(String color) {
		super(color);

	}

	@Override
	public void crack() {
		System.out.println("Cracking the Walnut");

	}

}
