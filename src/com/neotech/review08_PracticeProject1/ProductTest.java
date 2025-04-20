package com.neotech.review08_PracticeProject1;

public class ProductTest {
	public static void main(String[] args) {

		StoreItem[] items = { new Laptop("Lenovo", 399.99), new Phone("Apple", 1200.20), new HeadPhones("JBL", 30) };
		System.out.println("Store the products");

		for (StoreItem item : items) {
			item.showprice();
		}

		System.out.println(" Applyting Discounts ");

		for (StoreItem item : items) {
			if (item.getPrice() > 1000) {
				double discountedPriced = item.getPrice() * 0.9; // 10 off
				System.out.println(item.brand + "gets 10% discount: New price = $ " + discountedPriced);
			} else {
				System.out.println(item.brand + " has not discount: Price = $ " + item.getPrice());
			}

		}

	}

}
