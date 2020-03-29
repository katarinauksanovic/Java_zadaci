package vjezba;

import java.util.Arrays;
import java.util.Scanner;

public class Sortiranje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite elemente niza:");
		int niz[] = new int[20];

		for (int i = 0; i < 20; i++) {

			niz[i] = sc.nextInt();

		}

		for (int i = 0; i < 20; i++) {

			int pozicija = i;
			int min = niz[i];

			for (int j = i + 1; j < 20; j++) {

				if (niz[j] < niz[pozicija]) {

					pozicija = j;
					min = niz[j];
				}
			}

			int temp = niz[i];
			niz[i] = niz[pozicija];
			niz[pozicija] = temp;
		}
		System.out.println(Arrays.toString(niz)); 
		System.out.println();
		
         System.out.println("Najmanjih 6 brojeva niza su: \n");
		for (int i = 0; i < 6; i++) {

			
			System.out.print(niz[i] + " ");

		}
		System.out.println("\n");
		System.out.println("Najvecih 5 brojeva niza su: \n");
		
		for ( int i = niz.length-1; i>=15; i--) { 
			
			System.out.print(niz[i] + " ");
		}

		

	}

}
