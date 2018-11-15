package uebungenAbfragen;

import java.util.Scanner;

public class Hemd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preis =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben die Sie die anzahl der gekauften Hemden ein");
		int anzahl = sc.nextInt();
		
		if (anzahl>2)
			preis=2*49 + (anzahl-2)*25;
		else
			preis = anzahl *49;
		
		System.out.println(preis);
	}

}
