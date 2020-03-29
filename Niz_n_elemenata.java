package predavanja6;

import java.util.Scanner;

public class Niz_n_elemenata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Korisnik ucitava niz od n elemenata niza,
		//kao i neki broj. Program ispisuje elemente niza deljive tim brojem.
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljenu duzinu niza:");
		int x = sc.nextInt();

		int niz[] = new int[x];

		int i = 0;
		System.out.println("Unesite zeljeni broj: ");
		int n = sc.nextInt();
		
		System.out.println("Unesite zeljeni niz ");
		for (i = 0; i < niz.length; i++) {

			niz[i] = sc.nextInt();

			if (niz[i] % n == 0) {

				System.out.print(niz[i] + " ");

			}
		}
	}

}
