package predavanja6;

import java.util.Scanner;

public class Zbir_dva_niza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt();
            
			if (n > 0) {
			int niz[] = new int[n];
			int niz2[] = new int[n];
            int niz3[] = new int[n];
				System.out.println("Ucitajte zeljene elemente prvog niza:");

				for (int i = 0; i < niz.length; i++) {

					niz[i] = sc.nextInt();

				}

				System.out.println("Unesite zeljene elemente drugog niza:");

				for (int i = 0; i < niz2.length; i++) {

					niz2[i] = sc.nextInt();
				}

				

				for (int i = 0; i < niz3.length; i++) {

					niz3[i] = niz[i] + niz2[i];
				}
				System.out.println("Zbir vasih nizova po elementima iznosi:");

				for (int i = 0; i < niz3.length; i++) {

					System.out.print(niz3[i] + " ");
				}
			}

			else {
				System.out.println("Los unos, pokusajte ponovo");
			}

		}

	}
}
