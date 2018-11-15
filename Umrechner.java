import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Umrechner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bitte geben sie Geldbetrag ein");
		String eingabe = br.readLine();
		int betrag=Integer.parseInt(eingabe);
		int euro = betrag /100;
		int cent = betrag %100;
		System.out.printf("Der betrag ist %d folglich sind es %d Euro und %d Cent",betrag,euro,cent);
		
		
		
		

	}

}
