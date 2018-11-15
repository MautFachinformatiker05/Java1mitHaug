import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EingabeStreamReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Erzeugung eines Objektes von der Klasse 
		// System.in ist die Konsole
		//liest Eingabe nur in den Hauptspeicher
		InputStreamReader sr = new InputStreamReader(System.in);
		// um es bearbeiten zu können
		// ist die Weiterverarbeitung mit den BufferedReader erforderlich
		BufferedReader br = new BufferedReader(sr);
		//Grundsatz alle Eingaben und Ausgaben sind immer vom Typ String !!!
		
		System.out.println("Bitte geben sie ein");
		String eingabe = br.readLine();
		
		System.out.println(eingabe);
		
		// Einfache IF Abfrage
		//ob der eingegebene Wert Meier ist
		//Abfrage funkioniert nur mit equals
		if ( eingabe.toLowerCase().equals ("Meier"))
			System.out.println("Die Eingabe ist Meier");
		else
			System.out.println("Es ist eine andere Eingabe");
		
		
		System.out.println(eingabe.toLowerCase()); // Umwandeln in Kleinschrift
		System.out.println(eingabe.length()); // liefert die Länge die Stringes
		
		
		System.out.println(eingabe.charAt(0)); // liefert ein Zeichen an der 
											//entsprechenden Stelle der Index beginnt immer mit 0
		
		
		

	}

}
