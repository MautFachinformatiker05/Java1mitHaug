package uebungenAbfragen;

import java.util.Scanner;

public class Verischerung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lohn=0;
		String status ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie den Lohn ein");
		lohn=sc.nextDouble();
		System.out.println("Bitte geben sie privat oder gesetzlich ein");
		status=sc.next();
		
		if (lohn > 400 && status.toLowerCase().equals("gesetzlich"))
		{
				System.out.println("Sie sind versicherungspflichtig");
				
		}
		else
			System.out.println("Sie sind nicht versicherungspflichtig");
	}

}
