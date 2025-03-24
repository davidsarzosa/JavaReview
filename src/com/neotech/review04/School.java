package com.neotech.review04;

public class School {

	public static void main(String[] args) {

		Student student1 = new Student();

		student1.name = "Maelito";
		student1.studentNr = 567;
		student1.gradeLevel = 5;

		Student student2 = new Student();
		student2.name = "Paola";
		student2.studentNr = 563;
		student2.gradeLevel = 6;

		Student student3 = new Student();

		student3.name = "Consuelo";
		student3.studentNr = 1;
		student3.gradeLevel = 67;

		Teacher teacher = new Teacher();

		teacher.name = "Ligia";
		teacher.salary = 140000;
		teacher.subject = "Flowers";

		// re-assigning the subject
		teacher.subject = "Hotel Managment ";

		System.out.println("Let's call the methods!!! ");

		student2.study();

		student2.sleep();
		student1.sleep();

		teacher.teach();
		teacher.yellAtStudent("David");

	}

}
