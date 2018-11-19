package Schleifen;

import java.util.Scanner;

public class Seite81A21 {	//HANGMAN

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String wort = "";										// Das eingegebene Wort
		String kopie = "";										// wird an einer Stelle benötigt, um hangman zu aktualisieren
		System.out.print("Geben sie ein Wort für Hangman ein: ");
		wort = sc.next().toUpperCase();
		String hangman = wort.replaceAll("\\w", "-");			// die Hilfestellung ist wort, aber jedes zeichen ist ein '-'
		kopie = "";
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+hangman);		// ein - zu viel wird am Anfang angezeigt
		char ver;												// Der Char, aus dem String, den der Nutzer angegeben hat
		String verS;											// Der String, der vom Nutzer eingegeben werden muss 	//darf nur eine Stelle haben

		while (!wort.equals(hangman))									// Ist das Wort erraten worden?
		{
			Scanner vs = new Scanner(System.in);
			System.out.print("Eingabe: ");
			verS = vs.next();
			if (verS.length()!=1)								// wurde nur ein Buchstabe eingegeben?
			{
				System.out.println("Sie dürfen nur EINEN Buchstaben eingeben!");
				System.out.print("Eingabe: ");
				verS = vs.next();
				continue;
			}
			ver = verS.toUpperCase().charAt(0);								// Die Eingabe wird zum char

			for (int i=0;i<wort.length();i++)					// for-schleife, die über die chars im wort iteriert
			{
				if (ver == wort.charAt(i))						// Ist die Eingabe im Wort vorhanden?
				{	
					kopie = hangman;
					hangman = "";
						for (int x=0;x<wort.length();x++)			// Iteriert schon wieder über jeden Buchstaben, um hangman neu aufzubauen
						{
							if (i==x)
								hangman += ver;						// fügt die Eingabe an hangman an
							else
								hangman += kopie.charAt(x);			// fügt die Kopie von hangman an hangman an
						}
				
				}
			} 
			System.out.println(hangman);				// zeigt hangman an
		}
		sc.close();
	}

}
