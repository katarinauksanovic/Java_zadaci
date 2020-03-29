package Sportista;

import java.util.Scanner;

public class PodaciSportista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sportista kosarkas = new Sportista("Marko", "kosarka", "Partizan", 30);
		
		Sportista odbojkas = new Sportista ("Petar", "odbojka", "Crvena Zvezda", 25);
		
		Sportista fudbaler = new Sportista ("Ivan", "fudbal", "Primorac", 23);
		
		String s = kosarkas.dohvatiIme() + ", " + kosarkas.dohvatiKlub() + ", " + kosarkas.dohvatiSport() + ", " + kosarkas.dohvatiDres();
		
	System.out.println(s);
	
      System.out.println("Petar je odlucio da promeni klub.Unesite nov naziv kluba:");
      
      Scanner sc = new Scanner(System.in);
      String a = sc.nextLine();
      
      odbojkas.postaviKlub(a);
      
      System.out.println("U novom klubu, Petru su dali novi broj dresa.Unesite dres:");

      int x = sc.nextInt();
      odbojkas.postaviDres(x);
      
      String k = odbojkas.dohvatiIme() + ", " + odbojkas.dohvatiKlub() + ", " + odbojkas.dohvatiSport() + ", " + odbojkas.dohvatiDres();
      
      System.out.println(k);
	}

}
