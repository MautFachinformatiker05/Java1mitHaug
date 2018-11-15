package uebungenAbfragen;

import java.util.Scanner;

public class Rente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Geben sie ihr Geburtsjahr ein");
		int gebjahr=sc.nextInt();
		System.out.println("Geben sie ihr Arbeitsjahre ein");
		int arbjahr=sc.nextInt();
		System.out.println("Geben sie ihr akutelles Jahr ein");
		int aktjahr= sc.nextInt();
		
		int alter = aktjahr+100-gebjahr;
		if  (alter >65 && arbjahr> 40)
			System.out.println("Sie sind rentenberechtigt");
		else
			System.out.println("Sie sind rentenberechtigt");
		
		
		
	}

}
