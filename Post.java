package uebungenAbfragen;

import java.util.Scanner;

public class Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie das Gewicht ein");
		int gewicht=sc.nextInt();
		
		System.out.println("Bitte geben sie die Anzahl ein");
		int anzahl=sc.nextInt();
		
		System.out.println("Einschrieben ja/nein");
		
		String einschreiben = sc.next();
		double preis =0;
		
		
		if (gewicht >= 20)
			preis = 0.90;
		else
			preis =0.55;
		
		
		if (einschreiben.toLowerCase().equals("ja")))
			preis += 2.05;
		
		preis *= anzahl;
		
		System.out.println("Gewicht " + gewicht);
		System.out.println("Anazahl " + anzahl);
		System.out.println("Einschrieben " + einschreiben);
		System.out.printf("Gesamtpreis : %.2f",preis);
		

	}

}
