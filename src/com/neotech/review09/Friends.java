package com.neotech.review09;

public class Friends {

	String friend;

	public Friends(String friend) {
		this.friend = friend;

	}

	public void friendsInfo() {
		System.out.println("this is my friend " + friend);
	}

	// this will be to display the information of the string

	public String toString() {

		return friend;
	}

}
