package com.neotech.review04;

public class Methods {

	void sayWelcome() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Welcome");
		}
		System.out.println();
	}

	void sayWelcomeWithNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Welcome");
		}

	}

	void sayGreeting(String greeting) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(greeting + " ");
		}
		System.out.println();
	}

	void sayGreetingWithNumber(String greeting, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(greeting + "");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Methods m = new Methods();
		m.sayWelcome();

		m.sayWelcomeWithNumber(3);
		m.sayWelcomeWithNumber(7);

		// Compile- time error : the method accepts only integer not Strings
		// m.sayWelcomeWithNumber("nine");

		m.sayGreeting("Hola");
		m.sayGreeting("Priviet");

		m.sayGreetingWithNumber("Mehaba", 4);
		m.sayGreetingWithNumber("Konichiwa", 6);

		// Compile time - error
		// You have to provide 2 parameters -- > String & int
		// m.sayGreetingWithNumber("Ciao");
		
		
		// Termininology --> Invoke, call, Execute a method -->  is the same 
		
		

	}

}
