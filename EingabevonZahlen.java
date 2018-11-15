import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EingabevonZahlen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Verkürzung auf eine Zeile
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bitte geben Sie eine Zahl ein");
		String eingabe = br.readLine();
		
		// die Eingabe muss in diesem in einen numerischen Datentyp umgewandelt werden
		int zahl = Integer.parseInt(eingabe);
		System.out.println(zahl);
		// Für Double gibt es Double.ParseDouble
		
		
	}

}
