package com.neotech.review04;

public class Teacher {

	String name;
	int  salary;
	String subject;

	void teach() {
		System.out.println(name + "is teaching " + subject);
	}

	void yellAtStudent(String studentName) {
		System.out.println(name + " is yelling at student " + studentName);
	}

}
