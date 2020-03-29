package dodatnizadaci;

import java.util.Scanner;

public class Kvadrat_ili_pravougaonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Korisnik unosi dve dimenzije pravougaonika. Potrebno je proveriti da li je u
		 * pitanju kvadrat i ispisati informaciju o tome.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljene dimenzije:");

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		if (a > 0 && b > 0 && a != b) {

			System.out.println("Nije u pitanju kvadrat");

		} else {

			if (a < 0 || b < 0) {

				System.out.println("Greska. Broj mora biti pozitivan.");
			} else {
				System.out.println("U pitanju je kvadrat");
			}

		}

	}
}
