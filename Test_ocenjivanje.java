package dodatnizadaci;

import java.util.Scanner;

public class Test_ocenjivanje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Test se ocenjuje uzimajuci obzir broj osvojenih poena na sledeci nacin: poeni
		 * <50 => ocena je 5 50<= poeni <60 => ocena je 6 60<= poeni <70 => ocena je 7
		 * 70<= poeni <80 => ocena je 8 80<= poeni <90 => ocena je 9 poeni >= 90 =>
		 * ocena je 10. Napisati program koji sa standardnog ulaza ucitava broj poena i
		 * korisniku ispisuje koju je ocenu dobio.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj osvojenih poena:");

		int a = sc.nextInt();

		if (a > 0 && a < 50) {

			System.out.println("Vasa ocena je 5.");

		}

		if (a < 0) {
			System.out.println("Greska.Unesite pozitivan broj.");
		}

		else {

			if (a <= 60) {
				System.out.println("Vasa ocena je 6.");
			}
			if (a <= 70) {
				System.out.println("Vasa ocena je 7.");
			}
			if (a <= 80) {
				System.out.println("Vasa ocena je 8.");
			}
			if (a <= 90) {
				System.out.println("Vasa ocena je 9.");
			}

			else {
				System.out.println("Vasa ocena je 10.");
			}

		}
	}
}
