package com.neotech.review08_Polymorphisim;

public class Turkish extends Human{

	Turkish(){
		
	}
	
	Turkish(String name ){
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println("Ben turkce konusuyorum. Benim adim " + name);
	}
	
	public void makeBaklava() {
		System.out.println("I am making baklava! ");
	}
	
}
