package com.neotech.review01;

public class VariableDemoPractice {

	public static void main(String[] args) {

		String firstName = "David Alejandro ";

		System.out.println("My name is " + firstName);

		// After I moved to the US I got a new name

		firstName = "Benjamin";

		System.out.println("My name is " + firstName);

		String lastName = "Sarzosa";
		System.out.println("My Full Name is " + firstName + " " + lastName);

		int age = 20;

		System.out.println(firstName + " " + lastName + " " + age + 1);
		System.out.println(firstName + " " + lastName + " " + (age + 1));

		System.out.println(age);

		// afeter 10 years
		age += 10;
		lastName = "Wayne";

		System.out.println("After I moved to the US and become a new person ");
		System.out.println(firstName + " " + lastName);
		System.out.println();
		System.out.println("=======================================================================");
		System.out.println();
		String car = "Toyota Hilux 2005";
		int year = 2005;

		System.out.println("Tell me what car do you have and what year is it ? ");

		System.out.println("I have " + car + " " + year);
		System.out.println("I become a QA and now my car is ");

		car = "Toyota Supra ";
		year += 10;
		System.out.println("I have upgrade to " + car + " " + year);

		System.out.println();
		System.out.println("=======================================================================");
		System.out.println();

		String place = "Kiev Ukraine";
		int age2 = 18;
		String fullName = "David Alejandro Sarzosa Moya ";
		String car2 = "I did not have a car";
		int debt = 0;
		String idioms = "Spanish, Russian";

		System.out.println("Tell me about you life when you were " + age2);
		System.out.println(" Hi my name is  " + fullName + " I use to live " + place + " when I was " + age2
				+ " at the the time I use to speak  " + idioms + " and my debt was  " + debt + " and my car was "
				+ car2);
		System.out.println();
		place = "Austin Texas";
		age2 += 11;
		car2 = "Toyota Highlander";
		debt = 12000;
		idioms = "Russian, Spanish and Enlgish";
		System.out.println();
		System.out.println("Tell me about you life when you were " + age2);
		System.out.println(" Hi my name is  " + fullName + " I live " + place + " when I was " + age2
				+ " at the the time I use to speak  " + idioms + " and my debt was  " + debt + " and my car was "
				+ car2);

	}

}
