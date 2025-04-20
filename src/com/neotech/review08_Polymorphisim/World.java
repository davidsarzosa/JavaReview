package com.neotech.review08_Polymorphisim;

public class World {

	public static void main(String[] args) {
		
		Human.planet = "Earth";
		
		Human h1 =  new Human();
		System.out.println(h1.name + "lives on " + Human.planet);
		
		 Human h2 = new Human("Sofia");
		 System.out.println(h2.name + "lives on " + Human.planet);
		
		 Human.planet = "Marts";
		 System.out.println("-------------------------------------");
		 
		 System.out.println(h2.name + "lives on " + Human.planet);
		 
		 // Declarin a variable of type Human 
		 Human h3;
		 
		 // Creating an Alabanian and assigning to H3 
		 
		 h3 = new Albanian("Elion"); // up-casting 
		 System.out.println(h3.name + " lives on " + Human.planet);
		 
		 // h4 is a variable of type Human
		 // Inside H4 we are storing a Turkish person 
		 
		 Human h4 = new Turkish("Furkan"); // Up-casting automatically 
		 System.out.println(h4.name + " lives on " + Human.planet);
		 
		 System.out.println("-------------------------------------");
		 System.out.println("Let's make the people talk, by giving money :) ");
		 
		 h1.talk();
		 h2.talk();
		 h3.talk();
		 h4.talk();
		 
		 // Polymorphisims 
		 // Method Overriding 
		 // Run time Polymorphisim/ late binding / dynamic biding 
		 
		 // h4.makeBaklava(); // compile error because it is a Human Type 
		 
		 System.out.println("-------------------------------------");
		 
		 // This is a safe way to DOWN-CAST 
		 
		 if(h3 instanceof Albanian) {
			 
			 // Can cast/ convert into Albanian
			 Albanian alb = (Albanian) h3;
			 alb.albaninanDance();
		 }else if(h3 instanceof Turkish){
			 // Can cast/ convert into Turkish 
			 Turkish turk = (Turkish)h3;
			 turk.makeBaklava();
		 }
		 
		 System.out.println("-------------------------------------");
		 
		  American us1 = new American("Donal", "654-216-542");
		  us1.talk();
		  us1.taxReturn();
		  
		  Human h5 = us1; // up-casting implicitly 
		  h5.talk();
		  // h5.taxReturn(); 
		  
		 American us2 = (American) h5; // down-Casting explicitly 
		 us2.taxReturn();
		 
		 System.out.println("-----------------Power of Polymorphisim-----------");
		 
		 Human[] humans = new Human[6];
		 humans[0] = h1;
		 humans[1] = h2;
		 humans[2] = h3;
		 humans[3] = h4;
		 humans[4] = h5;
		 humans[5] = new American("Barack", "213-321-654"); // UP-CASTING 
		 
		 // This is possible ONLY BECAUSE OF INHERITANCE 
		 
		 for(Human element : humans) {
			 element.talk();
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}
	
	
	
	
	
}
