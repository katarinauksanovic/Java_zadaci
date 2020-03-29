package domaci2002;

import java.util.Scanner;

public class Fibonacijev_niz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int i = 1;

		System.out.println("Ispisati prvih " + n + " brojeva Fibonacijevog niza:");

		for (i = 1; i <= n; i++) {
			
			
			System.out.println(a);

			int suma = a + b;
			a = b;
			b = suma;

		}

	}

}
