package zadaciGaga;

import java.util.Scanner;

public class Operacije_sa_nizovima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati metodu koja od dva niza iste duzine formira treci niz tako da
		 * ukoliko se na i-toj poziciji u oba niza nalazi paran broj onda ih sabira ,ako
		 * je neparan broj onda ih mnozi a ako je jadan paran a drugi neparan onda ih
		 * oduzima.
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("Unesite prvi niz");

		int niz1[] = new int[n];

		for (int i = 0; i < niz1.length; i++) {

			niz1[i] = sc.nextInt();
		}

		System.out.println("Unesite drugi niz");
		int niz2[] = new int[n];

		for (int i = 0; i < niz2.length; i++) {

			niz2[i] = sc.nextInt();

		}

		int niz3[] = new int[n];

		for (int i = 0; i < n; i++) {

			if (niz1[i] % 2 == 0 && niz2[i] % 2 == 0) {

				niz3[i] = niz1[i] + niz2[i];
			}

			if (!(niz1[i] % 2 == 0 && niz2[i] % 2 == 0)) {

				niz3[i] = niz1[i] * niz2[i];
			}

			if (niz1[i] % 2 == 0 && !(niz2[i] % 2 == 0) || !(niz1[i] % 2 == 0) && niz2[i] % 2 == 0) {
				if (niz1[i] > niz2[i]) {
					niz3[i] = niz1[i] - niz2[i];
				} else {
					niz3[i] = niz2[i] - niz1[i];
				}
			}

		}

		System.out.println("Prvi niz:");
		for (int i = 0; i < n; i++) {

			System.out.print(niz1[i] + " ");
		}
		System.out.println("\n");

		System.out.println("Drugi niz");
		for (int i = 0; i < n; i++) {

			System.out.print(niz2[i] + " ");
		}
		System.out.println("\n");

		System.out.println("Teci niz");
		for (int i = 0; i < n; i++) {

			System.out.print(niz3[i] + " ");
		}

	}

}
