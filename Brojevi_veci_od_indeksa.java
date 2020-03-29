package predavanja7;

import java.util.Scanner;

public class Brojevi_veci_od_indeksa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program koji ce na standardnom
		// ispisu ispisati proizvod elemenata niza
		// koji su veci od svog indeksa(preko konzole uneti duzinu i clanove niza)

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite zeljenu duzinu niza:");
		int n = sc.nextInt();

		System.out.print("Unesite elemente niza:");
		int niz[] = new int[n];
		for (int i = 0; i < n; i++)
			System.out.print(niz[i] = sc.nextInt());

		int suma = 1;
		for (int i = 0; i < n; i++) {

			if (niz[i] > i) {

				suma *= niz[i];
			}

		}
		System.out.println("\nProizvod elemenata iznosi " + suma);

	}

}
