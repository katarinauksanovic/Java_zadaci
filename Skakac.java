package predavanja8;

import java.util.Scanner;

public class Skakac {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean ugrozen = false;

		System.out.print("Unesite poziciju:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		while (x <= 0 || x>8 || y <= 0 || y>8 || a <= 0 || a >8 || b <= 0 || b>8 || (x==a && y==b)) {
            System.out.println("Pogresan unos. Unesite pozicije figura ponovo:");
			x = sc.nextInt();
			y = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();

		}

		

			if (x == (a - 1) && b == (y - 1)) {
				ugrozen = true;
			}
			
			
			if (x == (a - 1) && b == (y + 1)) {
				ugrozen = true;
			}
			if (x == (a + 1) && b == (y - 1)) {
				ugrozen = true;
			}
			if (x == (a + 1) && b == (y + 1)) {
				ugrozen = true;
			} 
		

		

		

		if (ugrozen == true) {

			System.out.println("Skakac je ugrozen");
		}

		else {
			System.out.println("Skakac nije ugrozen");
		}
	}

}
