package com.neotech.review09;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();
		// studentList.add("Deyo"); we canNOT add a String
		Student s1 = new Student("Deyo");

		studentList.add(s1);
		studentList.add(new Student("Furkan"));
		studentList.add(new Student("Anastasia"));
		studentList.add(new Student("Greer"));

		// Lets Iterate them
		for (Student element : studentList) {
			element.studentInfo();
		}
		System.out.println();
		System.out.println("-----------------------Using Iterator----------------- ");
		System.out.println();

		Iterator<Student> it = studentList.iterator();
		while (it.hasNext()) {
			it.next().studentInfo();
		}
		System.out.println();
		System.out.println("-----------------This will be for Friends ------------------");
		System.out.println();

		ArrayList<Friends> friendList = new ArrayList<>();
		Friends f1 = new Friends("Roberto");
		friendList.add(f1);
		friendList.add(new Friends("Amelia"));
		friendList.add(new Friends("Patricia"));
		friendList.add(new Friends("Ali"));

		for (Friends friend : friendList) {
			friend.friendsInfo();
		}
		System.out.println();

		System.out.println("-----------------------Using Iterator----------------- ");

		Iterator<Friends> itf = friendList.iterator();
		while (itf.hasNext()) {
			Friends f = itf.next();
			System.out.print(f + " - ");
			f.friendsInfo();

		}

	}
}
