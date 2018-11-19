package Schleifen;

import java.util.Scanner;

public class Seite84A32 {

	public static void main(String[] args) {

		int skala = (int)(Math.random()*100);
		int zufall = (int)(Math.random()*10+skala);
		System.out.println("Es wurde eine Zufallszahl zwischen "+(skala)+" und "+(skala+9)+" generiert.");
		System.out.println("Erraten Sie die Zahl, Sie haben drei Chancen!\nIhr Tipp:");
		int eingabe = -1;
		for (int i = 3;i>0;i--)
		{
			Scanner sc = new Scanner (System.in);
			eingabe = sc.nextInt();
			if (eingabe==zufall)
			{
				System.out.println("Volltreffer!\nSie sind ein Siegertyp!");
				break;
			}
			else
				System.out.println("Falsch!");
				
		}
		if (eingabe!=zufall)
			System.out.println("Die richtige Zahl war "+zufall+".\nSie haben leider verloren.");
	}

}
