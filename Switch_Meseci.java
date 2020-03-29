package primjeri_Java;

import java.util.Scanner;

public class Switch_Meseci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Ukucajte ime meseca u godini:");
		
		String a = sc.next();
		
		switch (a) {
		
		case "Januar":
		case "Jun":
		case "Jul":
			System.out.println(3);
			break;
		case "Februar":
		case "Septembar":
		case "Oktobar":
		case "Novembar":
		case "Decembar":
			System.out.println(1);
			break;
		case "Mart":
		case "Maj":
		case "April":
		case "Avgust":
			System.out.println(2);
			break;
		
		
	
		
		}
		
	}

}
