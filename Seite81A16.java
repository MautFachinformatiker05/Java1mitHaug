package Schleifen;

import java.util.Scanner;

public class Seite81A16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int erg= 1;
		System.out.print("Summe= ");
		for (int i=1;i<=n;i+=2)
		{
			if (i !=1)
				System.out.print(" * ");
			System.out.print(i);
			erg *= i;
		}
		
		System.out.println();
		System.out.println("Gesamtsumme = "+erg);
	}
}
