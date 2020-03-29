package predavanja6;

import java.util.Scanner;

public class Rastuci_opadajuci_niz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite zeljeni broj duzine niza:");
		int duzinaniza = sc.nextInt();
		int niz[] = new int[duzinaniza];
		boolean nizraste = true;

		int i = 0;
		System.out.println("Vas niz je:");
		for (i = 0; i < duzinaniza; i++) {
			niz[i] = sc.nextInt();
			System.out.print(niz[i] + " ");
		}

		for (i = 0; i < duzinaniza - 1; i++)
			if (niz[i] < niz[i + 1]) {

				nizraste = true;
			} else {
				nizraste = false;
				i = duzinaniza;

			}
		if (nizraste == true) {

			System.out.println("Niz je rastuci");
		} else {
			System.out.println("Niz je opadajuci");
		}

	}

}
