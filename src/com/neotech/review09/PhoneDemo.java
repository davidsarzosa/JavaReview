package com.neotech.review09;

public class PhoneDemo {

	public static void main(String[] args) {

		Phone p = new Phone("1235234", "Samsung", "pass@123");
		p.displayInfo();

		// Not able to access the password from this class
		// p.password = "abc";

		String serial = p.getSerialNumber("pass@123");
		System.out.println("the serial number is " + serial);

		p.setSerialNumber("Sofia");
		p.displayInfo(); // Did Not change

		System.out.println("--------------------------------");

		System.out.println("The brand is --> " + p.getBrand());

		// We cannot change the brand
		// because there is NO setter method
		// p.setBrand(); We cannot change the brand because
		// there is not a setter method

	}

}
