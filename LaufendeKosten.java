import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaufendeKosten {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("geben sie den Preis pro Einheit in Cent ein");
		double proEinheit=Double.parseDouble(br.readLine());
		System.out.println("geben sie die anzahl der Einheiten pro Jahr ein");
		int anzahlEinheiten=Integer.parseInt(br.readLine());
		double jahreskosten = (proEinheit*anzahlEinheiten)/100;
		System.out.println("Jahreskosten"+jahreskosten);
		
		
		
	}

}
