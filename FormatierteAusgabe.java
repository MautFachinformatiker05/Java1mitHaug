
public class FormatierteAusgabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=15;
		double preis =49.11111;
		boolean schalter = true;
		
		// zwei Teile
		//1.Formatierungsstring
		// %d Paltzhalter f�r integer
		//2.die entsprechenden Variablen
		// f�r jeden Platzhalter eine Variable
		System.out.printf("Ausgabe einer Zahl %d \n" , i);
		// %f gibt bei Double die Anzahl der Gesamtstellen
		// sowie die Anzahl der Nachkommastellen
		// %f rundet kaufm�nisch
		System.out.printf("Anzahl  %d Einzelpreis %10.2f\n",i,preis);
		System.out.printf("Hexadecimal %x\n",i);
		System.out.printf("Boolean Ausgabe %b", schalter);
	}

}
