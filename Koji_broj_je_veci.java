package dodatnizadaci;

import java.util.Scanner;

public class Koji_broj_je_veci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ucitati dva broja i ispisati koji od njih je veci.

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite zeljene brojeve:");

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		if (a >= b) {

			if ( a == b )
				System.out.println("Cifre su jednake");
			else {
			System.out.println("Prva cifra je veca od druge"); }
		}
		
		

		else {

			System.out.println("Druga cifra je veca od prve");
		}
	}

}
