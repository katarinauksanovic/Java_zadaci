package zadaciGaga;

import java.util.Scanner;

public class Prost_broj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisi metodu koja provjerava da li uneseni broj prost

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int brojac = 0;

			for (int i = 1; i <= n; i++) {

				if (n % i == 0) {
					brojac++;
				}
				;

			}
			if (brojac > 2) {
				System.out.println("Broj nije prost");

			} else {
				System.out.println("Broj je prost");

			}
		}
	}
}
