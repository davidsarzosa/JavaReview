package com.neotech.review08_Polymorphisim;

public class American extends Human {
	
	String SSN;
	American(){
		
	}
	
	American(String name, String SSN ){
		super(name);
		this.SSN = SSN;
	}
	
	
	@Override
	public void talk() {
		System.out.println("");
	}
	
	public void taxReturn() {
		System.out.println("I am doing taxes");
	}
	
	
	
	
	
	
	
	
}
