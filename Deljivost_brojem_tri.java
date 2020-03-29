package domaci2002;

public class Deljivost_brojem_tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Napisati program koji ce prebrojati koliko je brojeva
		//od 9 do 250 (ukljucujuci i njih) deljivih brojem tri.
		
	int a = 9;
	int i = 0;
	
	while ( a <= 250 ) {
		
		if ( a%3 == 0) {
		i += 1; 
		 }
		a++;
		
	} System.out.println(i);
	}

}
