package com.neotech.review08_Abstraction;

public class Albanian extends Human {

	public Albanian(String name) {
		super(name);
	}

	@Override
	public void talk() {

		System.out.println(name = "Says Pershendetje!");

	}

	public void albannianDance() {
		System.out.println("Dancing Valle Kosovare !");
	}

//	public void talk2() {
//		System.out.println("says Pershendetje! faster  ");
//	}

}
