package predavanja4;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 16; i++) {

			String str = "";
			if (i % 3 == 0)
				str += "Fizz";
			
			if (i % 5 == 0)
				str += "Buzz";
			
			if ( str.isEmpty()) str += i;
			System.out.println(str);
			}
			
		

		}

	}


