package Schleifen;

import java.util.Scanner;

public class Seite81A20 {

	public static void main(String[] args) {

		System.out.println("Wie viele Anmeldetermine soll es geben?");
		int erg = 0;
		Scanner sc = new Scanner(System.in);
		int term = sc.nextInt();
		//sc.close();
		for (int i = 1; i<term+1;i++)
		{
			System.out.print("Termin "+i+": Teilnehmerzahl ");
			Scanner vs = new Scanner(System.in);
			//if (vs.hasNextInt()==true)
			erg = erg + vs.nextInt();
			//vs.close();
		}
		System.out.println("Summe Teilnehmer: "+erg);
		
	}

}
