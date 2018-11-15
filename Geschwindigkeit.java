package uebungenAbfragen;

import java.util.Scanner;

public class Geschwindigkeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Geschwindkeit eingeben");
		Scanner sc = new Scanner(System.in);
		int geschwindkeit=sc.nextInt();
		
		geschwindkeit -=50;
		int punkte =0;
		
		if (geschwindkeit >= 40)
			punkte =4;
		else if (geschwindkeit >= 25)
			punkte=3;
		else if (geschwindkeit >= 20)
			punkte =1;
		
		System.out.println("Geschwindkeit :"+(geschwindkeit+50));
		System.out.println("Punkte :" +punkte);
		
		

	}

}
