package domaci2002;

import java.util.Scanner;

public class Kasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa 1 - dodavanje cene proizvoda na racun (ubacivanje u
		 * potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
		 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int a;
		int racun = 0;

		do {
			System.out.println("Unesite zeljenu opciju:");

			a = sc.nextInt();

			switch (a) {

			case 1:
				System.out.println("Molimo, unesite cenu proizvoda");
				int cenaproizvoda = sc.nextInt();
				if (cenaproizvoda > 0) {
					racun += cenaproizvoda;
					System.out.println("Vas racun je uvecan za " + cenaproizvoda);
				} else {
					System.out.println("Pogresan unos");
				}
				break;

			case 2:
				System.out.println("Unesite zeljeni iznos za placanje racuna:");
				int uplata = sc.nextInt();
				if (uplata < racun) {
					System.out.println("Greska, molimo vas pokusajte ponovo");
				} else {

					if (uplata >= racun) {

						System.out.println("Vas kusur iznosi " + (uplata - racun));
					}
				}
				break;
			case 0:
				System.out.println("Program se zavrsio");
				break;
			default:
				System.out.println("Pogresan unos");

			}

		} while (a != 0);

	}
}
