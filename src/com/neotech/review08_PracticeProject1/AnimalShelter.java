package com.neotech.review08_PracticeProject1;

public class AnimalShelter {

	public static void main(String[] args) {

		// will be also good to have an Array of Animals because is just easy to put
		// them all together

		Pet[] pets = { new Dog("Sam", 5), new Dog("Moss", 7), new Cat("Leo", 4), new Cat("Tais", 5),
				new Bird("Abelardo", 6), new Dog("TonyBola", 8) };

		System.out.println("Animal Austin Shelter pets list:");

		for (Pet pet : pets) {
			pet.makeSound();
			pet.displayInfo();

		}

		// Also we want to put them for adoption
		System.out.println();
		System.out.println("Adoption Process: ");

		for (Pet pet : pets) {
			if (pet.getAge() <= 4) {
				System.out.println(pet.name + " is elegible for adoption! ");
			} else {
				System.out.println(pet.name + " is too old for quick adoption, needs special care! ");
			}

		}

	}

}
