package domaci2002;

import java.util.Scanner;

public class Pravougaonik_od_zvezdica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {

				System.out.print("* ");
			}
			System.out.println();

		}

	}
}
