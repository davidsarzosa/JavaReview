package com.neotech.review08_Polymorphisim;

public class Albanian extends Human {	
		
		public Albanian() {
			
		}
		
		public Albanian(String name) {
			super(name);
		}
		
		@Override
		public void talk() {
			System.out.println("Une flas shqip. Une quhem " + name);
		}
		
		public void albaninanDance() {
			System.out.println("Dancing Valle Kosovare! ");
		}
		
		
		
	

}
