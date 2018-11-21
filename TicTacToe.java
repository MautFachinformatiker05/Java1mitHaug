package arrays;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] feld = new char [3][3];
		int spieler =0;
		int belegt=0;
		boolean schalter=true;
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				feld[i][j] = ' ';
			}
		System.out.println();	
		}
		
		while (schalter){
		spieler++; 
		
		
		// Ausgabe des Spielfelds
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(feld[i][j] + "|");
			
			}
		System.out.println("\n-----");	
		}
		
		// Eingabe des Spielers
		while (true){
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nBitte Geben sie die Zeile ein Spieler"+spieler);
		int zeile = sc.nextInt();
		System.out.println("Bitte Geben sie die Spalte  ein Spieler"+spieler);
		int spalte=sc.nextInt();
		
		zeile--;
		spalte--;
		
		if ( (zeile>3 || zeile < 0) || 
				(spalte>3 || spalte < 0))
		{
			System.out.println("Ungültige Zahl eigegeben");
			continue;
		}
		if (feld[zeile][spalte]!=' ')
		{
			System.out.println("Feld schon bestzt");
			continue;
		}
		
		if (spieler ==1)
		{
			feld[zeile][spalte]='X';
		 System.out.println(" X an Zeile "+(zeile+1)+" und Spalte " +(spalte+1)+" eingefügt");
		}
		else
		{
			feld[zeile][spalte]='O';
			 System.out.println(" O an Zeile "+(zeile+1)+" und Spalte " +(spalte+1)+" eingefügt");

		}
		 belegt++;
		
		break; }
		
		
		// Test ob einer Gewonnen hat
		
		
		for (int i=0;i<3;i++)
		{
		if ( feld[i][0]==feld[i][1]
				&& feld[i][0]==feld[i][2]
				&& feld[i][1]==feld[i][2]
				&& feld[i][0] !=' '			)
		{
			System.err.println("\nSpieler" + spieler+" hat gewonnen; 3 Wagrecht in der "+(i+1)+" Zeile");
			schalter=false;
		
		}
		}
		for (int i=0;i<3;i++)
		{
		if ( feld[0][i]==feld[1][i]
				&& feld[0][i]==feld[2][i]
				&& feld[1][i]==feld[2][i]
				&& feld[0][i] !=' '	)
		{
			System.err.println("\nSpieler" + spieler+" hat gewonnen; 3 Senkrecht in der "+(i+1)+" Zeile");
			schalter=false;
		
		}
		
		}
		
		if ( feld[0][0]==feld[1][1]
				&& feld[0][0]==feld[2][2]
				&& feld[1][1]==feld[2][2]
				&& feld[1][1] !=' '	)
		{
			System.err.println("\nSpieler " + spieler+" hat gewonnen in der Diagonalen");
			schalter=false;
		
		}
		
		if ( feld[2][0]==feld[1][1]
				&& feld[2][0]==feld[2][0]
				&& feld[1][1]==feld[2][0]
				&& feld[1][1] !=' '		)
		{
			System.err.println("\nSpieler " + spieler+"hat gewonnen in der Diagonalen");
			schalter=false;
		
		}
		
		
		
		// Sind 9 Runden vergangen ohne Sieg
		if (belegt==9 && schalter)
		{
			System.out.println("Keiner Konnte Gewinnen");
			break;
		}
		
		
		
		
		spieler = spieler %2;
		}	
		
	}

}
