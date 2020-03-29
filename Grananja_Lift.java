package primjeri_Java;

import java.util.Scanner;

public class Grananja_Lift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
         System.out.println("Unesite odgovarajucu tezinu"
         		+  " kako biste videli da li lift moze da se pokrene:");
         Scanner lift = new Scanner(System.in);  
       
         double nosivost = 680;
         double tezina = lift.nextDouble();
       
         if ( tezina <= 0 ) System.out.println( "Pogresan unos");
         else if ( nosivost > tezina ) System.out.println( "Lift je pokrenut");
         
         else {
        	 
        	 if (nosivost == tezina) System.out.println("Na granici je");
        	 
        	 else  System.out.println("Lift je preopterecen");
         
         } 
         
         
         
         
  
	}
}