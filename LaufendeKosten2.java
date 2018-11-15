import java.util.Scanner;

public class LaufendeKosten2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie die Kosten je Einheit ein");
		double einheit =sc.nextDouble();
		
		System.out.println("Bitte geben sie die Anzahl ein");
		int anzahl = sc.nextInt();
		
		//Ausgabe des Ergebnisse
		System.out.printf("Jahreskosten : %.2f",(einheit*anzahl/100));
		
		
		

	}

}
