package dodatnizadaci;

import java.util.Scanner;

public class Maksimum_tri_broja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ucitati tri broja i ispisati njihov maksimum.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tri broja:");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > 0 && b > 0 && c > 0) {

			if (a > b && a > c) {

				System.out.println("Maksimum iznosi " + a);
			}

			if (b > a && b > c) {

				System.out.println("Maksimum iznosi " + b);
			}

			if (c > a && c > b) {

				System.out.println("Maksimum iznosi " + c);
			}
		}

		else
			System.out.println("Greska.Unesite pozitivan broj.");
	}
}
