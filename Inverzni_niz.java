package predavanja6;

import java.util.Scanner;

public class Inverzni_niz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite zeljeni broj duzine niza:");
		int duzinaniza = sc.nextInt();
		int niz[] = new int[duzinaniza];
		int i = 0;
		System.out.println("Unesite zeljeni niz:");

		for (i = 0; i < duzinaniza; i++) {

			niz[i] = sc.nextInt();
			System.out.print(niz[i] + " ");
		}
		    System.out.println();
		    System.out.println("Inverzni niz iznosi:");

		for (i = duzinaniza - 1; i >= 0; i--) {
			
			System.out.print( niz[i] + " ");

		}

	}

}
