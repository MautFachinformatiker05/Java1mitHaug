
public class Arithemtische {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl1 =5;
		int zahl2 =2;
		int erg =0;
		// 1. wird die rechte Seite bearbeitet
		// ergebnis der rechten Seite wird der linken Seite zugewisen
		erg =zahl1+zahl2;
		System.out.println(erg);
		erg = zahl1 *zahl2;
		System.out.println(erg);
		erg = zahl1/ zahl2;
		System.out.println(erg);
		
		double ergd =0;
		// Regel der Dividend bzw Diviso oder beide müssen vom Datentyp double sein
		ergd = (double )zahl1/ zahl2;
		System.out.println(ergd);
		
		int zahl3=0;
		zahl3++; //Inkrement die zahl3 wird um 1 erhöht
		System.out.println(zahl3);
		
		int erg2 = 5;
		erg2 = erg2 + zahl2++ ; // Postfix erst nach dem statement wird die zahl2 erhöht
		
		erg2 = erg2 + ++zahl2; // Prefix 
								// wird zahl2 vor der Zuweisung erhöht
		
		System.out.println(erg2);

		// das gleiche gilt für --
		
		// verkürzte Schreibweise
		int zahl4=5;
		zahl4 +=3; // identisch mit zahl4 = zahl4 +3
		// gilt auch für -=,*=,/=
		System.out.println(zahl4);
		
		//modulo ist das Prozentzeichen
		int schalt = 2018 % 4;
		System.out.println(schalt);
		
		String stern = "*";
		System.out.println(stern);
		
		
		// Mathematische Bibliothekt
		System.out.println(Math.random()); // liefert eine Zufallszahl zwischen
											// 0 und 1
		double wert1=49.113;
		wert1 *=100;
		System.out.println(wert1);
		// Math.round liefert ein Datentyp long zurück
		System.out.println(Math.round(wert1)/100.);
		
		double wert2=49.339;
		int erg4 = (int) Math.round(wert2*100);
		System.out.println(erg4);
		
		double erg5 =erg4/100.;
		System.out.println(erg5);
		
		
		
		
				
		
		
		

	}

}
