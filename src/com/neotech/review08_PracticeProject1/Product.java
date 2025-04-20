package com.neotech.review08_PracticeProject1;

public interface Product {

	void showprice();

	double getPrice();

}

// Creating an abstract class 

abstract class StoreItem implements Product {

	String brand;
	double price;

	StoreItem(String brand, double price) {
		this.brand = brand;
		this.price = price;

	}

	@Override
	public double getPrice() {

		return price;

	}

}

class Laptop extends StoreItem {

	Laptop(String brand, double price) {
		super(brand, price);

	}

	@Override
	public void showprice() {
		System.out.println("The brand is " + brand + " price is " + price);
	}

}

class Phone extends StoreItem {

	Phone(String brand, double price) {
		super(brand, price);
	}

	@Override
	public void showprice() {

		System.out.println("The brand is " + brand + " price is " + price);

	}

}

class HeadPhones extends StoreItem {

	HeadPhones(String brand, double price) {
		super(brand, price);
		
	}

	@Override
	public void showprice() {
		System.out.println("The brand is " + brand + " price is " + price);

	}
	
	
	
	
}


