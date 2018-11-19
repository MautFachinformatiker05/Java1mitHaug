package Schleifen;

import java.util.Scanner;

public class Seite81A15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		double erg= 0;
		System.out.print("Summe=");
		for (int i=1;i<=n;i++)
		{
			if (i !=1)
				System.out.print(" + ");
			System.out.print("1/"+i);
			erg+=1.0/i;
		}
		
		System.out.println();
		System.out.println("Gesamtsumme = "+erg);
	}
}
