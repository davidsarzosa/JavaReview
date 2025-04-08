package com.neotech.review06;

public class USA {

	public String BestSchool = "Neotech"; // project level
	String state = "Texas"; // package level
	protected String mainState = "New York"; // package level
	private String capitalCity = "Washintong DC"; // class level

	public void attendNeoTech() {
		System.out.println("Neotech can be attended from eveywhere");
	}

	protected void playNBA() {
		System.out.println("Only countries in the same package can join NBA!");
	}

	private void selectPresident() {
		System.out.println("The US presit can only be selected within USA");
	}

	public static void main(String[] args) {

		USA us = new USA();

		System.out.println("Accessing the variables within USA");

		System.out.println("public --> " + us.BestSchool);
		System.out.println("default --> " + us.state);
		System.out.println("protected -->" + us.mainState);
		System.out.println("private ---> " + us.capitalCity);

		System.out.println("---------------------------------");

		System.out.println("Accessing the methods from within USA");

		us.attendNeoTech();
		us.playNBA();
		us.selectPresident();

	}
}
