package predavanja9;

import java.util.Scanner;

public class Palindrom_sa_metodama {

	public static void main(String[] args) {
		
		System.out.println("Unesite duzinu i elemente niza ");

		int[] niz = elementiNiza();
		ucitajNiz(niz);
		
		provjera(niz);

	}

	public static int[] elementiNiza() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		if ( a <= 0 ) { 
			
			System.out.println("Los unos");
		}

		int niz[] = new int[a];

		for (int i = 0; i < niz.length; i++) {

			niz[i] = sc.nextInt();
		}
		return niz;

	}

	public static void ucitajNiz(int[] niz) {

		for (int i = 0; i < niz.length; i++) {

			System.out.print(niz[i] + " ");
		}
	}

	public static void provjera(int []niz) {

		elementiNiza();

		int[] nizB = new int[niz.length];
		int x = 0;
		for (int i = niz.length - 1; i >= 0; i--) {
			nizB[x] = niz[i];
			x++;
		}

		int brojac = 0;
		for (int g = 0; g < niz.length; g++) {
			if (niz[g] == nizB[g])
				brojac++;
		}
		
		
		

		if (brojac == niz.length) {
			System.out.println("Niz je palindrom");}
		else {
			System.out.println("Niz nije palindrom");}

	}

}
