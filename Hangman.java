package Arrays;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie das Suchwort ein.");
		Scanner sc = new Scanner(System.in);
		String wort = sc.next();
		
		char[] vorgabe = new char[wort.length()];
		char[] ergebnis = new char[wort.length()];
		
		for (int i=0; i<wort.length();i++)
		{
			vorgabe[i] = wort.charAt(i);
			ergebnis[i] = '-';
		}
		
		//Eingabe des Buchstabens des Benutzers
		while(true)
		{
			System.out.println("Bitte geben sie einen Buchstaben ein.");
			Scanner sce = new Scanner(System.in);
			char zeichen = sce.next().charAt(0);
			//Prüfung, ob das Zeichen in der Vorgabe enthalten ist
			for(int i=0;i<wort.length();i++)
			{
				if (vorgabe[i]==zeichen)
				{
					// Einspielen des Zeichens in dem Ergebnis
					ergebnis[i]=zeichen;
				}
			}
			
			for (int i=0;i<wort.length();i++)
			{
				System.out.print(ergebnis[i]);
			}
			System.out.println();
			
			//Prüfung, ob Wort erraten wurde
			boolean schalter = true;
			for (int i=0;i<wort.length();i++)
			{
				if (ergebnis[i] == '-')
				{
					schalter = false;
					break;
				}
			}
			
			//Ende, wenn der Schalter immer noch auf treu steht
			if (schalter==true)
			{
				System.out.println("Glückwunsch! Sie haben das Wort erraten!");
				break;		// while-Schleife wird abgebrochen
			}
				
		}

	}

}
