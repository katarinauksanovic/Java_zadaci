package dodatnizadaci;

import java.util.Scanner;

public class Switch_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji ce da testira poznavanje while petlje na sledeci nacin:
		 * Ispisuje poruku sa pitanjem koja kljucna rec izlazi iz petlje u programskom
		 * jeziku Java, i ponudjene odgovore: A: int B: continue C: exit D: break
		 * Obezbediti da nakon odabira korisnik dobije informaciju da li je tacno
		 * odgovorio na pitanje.
		 * 
		 * Ukoliko nije, pitati ga da li zeli da pokusa ponovo i ako je odgovor potvrdan
		 * omoguciti ponovni pokusaj.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Koja kljucna rec izlazi iz petlje u" + " programskom jeziku Java? ");
		System.out.println("");
		System.out.println("A: int");
		System.out.println("B: continue");
		System.out.println("C: exit");
		System.out.println("D: break");

		String x = sc.next();
		x = x.toUpperCase();
		boolean odgovor = true;
		String a = "A";
		String b = "B";
		String c = "C";
		String d = "D";

		while (x.equals(a) || x.equals(b) || x.equals(c) || x.equals(d)) {

			switch (x) {

			case "A":
				System.out.println("Vas odgovor je pod A: int");
				System.out.println(!odgovor);

				break;

			case "B":
				System.out.println("Vas odgovor je pod B: continue");
				System.out.println(!odgovor);
				break;

			case "C":
				System.out.println("Vas odgovor je pod C: exit");
				System.out.println(!odgovor);
				break;

			case "D":
				System.out.println("Vas odgovor je pod D: break");
				System.out.println(odgovor);
				break;

			}

			break;
		}

		while (!(x.equals(a) || x.equals(b) || x.equals(c) || x.equals(d))) {
			System.out.println("Greska. Da li zelite da ponovite Vas unos?");
			String i = sc.next();
			i = i.toUpperCase();
			String w = "DA";
			String e = "NE";

			if (i.equals(w)) {

				System.out.println("Unesite ponovo Vas odgovor:");
				String k = sc.next();
				k = k.toUpperCase();

				switch (k) {

				case "A":
					System.out.println("Vas odgovor je pod A: int");
					System.out.println(!odgovor);

					break;

				case "B":
					System.out.println("Vas odgovor je pod B: continue");
					System.out.println(!odgovor);
					break;

				case "C":
					System.out.println("Vas odgovor je pod C: exit");
					System.out.println(!odgovor);
					break;

				case "D":
					System.out.println("Vas odgovor je pod D: break");
					System.out.println(odgovor);
					break;
				}
				
			}

			else {

				System.out.println("Izasli ste iz testiranja.");
			}
			break;
		}

	}
}
