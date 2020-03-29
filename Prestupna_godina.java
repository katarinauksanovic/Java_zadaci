package dodatnizadaci;

import java.util.Scanner;

public class Prestupna_godina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ispituje da li je godina prestupna ili nije, sve dok
		 * korisnik za godinu ne unese broj koji nije pozitivan.
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljenu godinu:");

		int x = sc.nextInt();

		while (x > 0 || x < 0 ) {
			if (!(x % 4 == 0) && !(x % 100 == 0)) {

				System.out.println("Godina nije prestupna.");
				break;
			}

			else if (x < 0) {
				System.out.println("Molimo Vas, unesite pozitivan broj");
				break;
			}

			else {
				System.out.println("Godina je prestupna.");
				break;

			}

		}

	}

}
