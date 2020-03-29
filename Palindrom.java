package predavanja7;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite zeljenu duzinu niza");
		int n = sc.nextInt();

		System.out.print("Unesite zeljene elemenate:");
		int niz[] = new int[n];

		boolean palindrom = false;
		int brojac = 0;

		for (int i = 0; i < n; i++) {

			niz[i] = sc.nextInt();

		}
		for (int i = 0; i < n / 2; i++) {

			for (int j = n - 1; j > n/2; j--) {

				if (niz[j] == niz[i]) {

					brojac++;

				}

			}
		}
		if (brojac == n / 2) {

			palindrom = true;
		}
		if (palindrom == true)
			System.out.println("Niz je palindrom");

		else {
			System.out.println("Niz nije palindrom");
		}

	}

}
