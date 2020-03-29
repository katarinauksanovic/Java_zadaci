package predavanja7;

import java.util.Scanner;

public class Recenica_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite zeljenu recenicu:");
		String recenica = sc.nextLine();

		String[] reci = recenica.split(" ");
		int broj = 0;
		for (int i = 0; i < reci.length; i++) {

			String a = reci[i];

			if (a.charAt(a.length() - 1 ) == 'd') {
				;
			broj++;}

		}
		System.out.println("Recenica ima " + broj + " reci koje se zavrsavaju slovom d");
	}

}
