package Sportista;

public class Sportista {

	private String imeiprezime;
	private String sport;
	private String klub;
	public int brojdresa;

	public Sportista(String i, String s, String k, int d) {

		imeiprezime = i;
		sport = s;
		klub = k;
		brojdresa = d;

	}

	public String dohvatiIme() {

		return imeiprezime;
	}

	public String dohvatiSport() {

		return sport;
	}

	public String dohvatiKlub() {

		return klub;
	}
	
	public void postaviKlub(String a) { 
		
		klub = a; 
		
	}
	public int dohvatiDres() { 
		
		return brojdresa;
	}

	public void postaviDres(int d) {

		if (d < 0) {
			System.out.println("Nevalidan broj");
		} else {
			brojdresa = d;
			
		}

	}

}
