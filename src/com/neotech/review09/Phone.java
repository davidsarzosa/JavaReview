package com.neotech.review09;

public class Phone {

	private String serialNumber;
	private String brand;
	private String password;

	public Phone(String serialNumber, String brand, String password) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.password = password;

	}

	public void displayInfo() {
		System.out.println("This is a " + brand + " and has a serial number " + serialNumber);
	}

	// Getters and Setters
	// This method will return the serialNumber
	// Only if you provide the correct password

	public String getSerialNumber(String serialNumber) {
		if (password.equals(password)) {
			return serialNumber;
		} else {
			return "Aceess Denied! ";
		}
	}

	// This method will change/reassing the serialNumber
	// Only if it is 7 characters long

	public void setSerialNumber(String serialNumber) {

		if (serialNumber.length() == 7) {

			this.serialNumber = serialNumber;
		}
	}

	// Brand should be view Only
	public String getBrand() {
		return brand;

	}

	// password is hiding, no getter no setter

}
