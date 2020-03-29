package domaci2002;

import java.util.Scanner;

public class Unos_i_sabiranje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		// broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
		// primer: ako korisnik unese 1 2 5 3 -1, program treba da ispise 11

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljene brojeve:");

		int a;
		int zbir = 0;

		do {
			a = sc.nextInt();
			if ( a < 0 ) break;
			
			else { zbir = zbir + a; }

		} while (a > 0);
		
	
		System.out.println("Zbir brojeva iznosi:" + zbir);
	}
}
