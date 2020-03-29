package domaci2002;

import java.util.Scanner;

public class Suma_Parnih_Proizvod_Neparnih_brojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju). Podrazumeva se da se n ucitava preko
		 * standardnog ulaza
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj:");
		int n = sc.nextInt();

		if (n > 0) {
			int suma = 0;
			int proizvod = 1;

			for (int i = 0; i < n; i++) {

				if (i % 2 == 0) {
					suma = suma + i;
				}

				else
					proizvod = proizvod * i;
			}

			System.out.println("Za broj " + n + " suma parnih brojeva je " + suma + ", a proizvod neparnih brojeva je "
					+ proizvod + ".");
		}

		else if (n == 0)
			System.out.println("Rezultat je 0.");

		else
			System.out.println("Greska! Negativan broj.");

	}

}
