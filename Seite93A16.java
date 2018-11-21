package Arrays;

import java.util.Scanner;

public class Seite93A16 {

	public static void main(String[] args) { // Umrechner Bin, Okt, Hex

		char[] erg = new char[100];
		int counter = 99;

		System.out.println("Geben Sie an, welche Zahl sie umrechnen wollen.");
		Scanner sc = new Scanner(System.in);
		int zahl = sc.nextInt();
		System.out.println("Geben Sie an,in welche Basis sie umrechnen wollen: Binär, Oktal oder Hexadezimal.");
		String ein = sc.next().toLowerCase();
		sc.close();

		if (ein.matches("^bin"))
		{
			for (int i=99;zahl!=0;i--)
			{
				erg[i] = (char)(48+zahl%2);
				zahl/=2;
				counter--;
			}
		}

		if (ein.matches("^okt"))
		{
			for (int i=99;zahl!=0;i--)
			{
				erg[i] = (char)(48+zahl%8);
				zahl/=8;
				counter--;
			}
		}

		if (ein.matches("^hex"))
		{
			for (int i=99;zahl!=0;i--)
			{
				erg[i] = (char)(48+zahl%16);
				if (zahl%16>9)
					erg[i]+=7;
				zahl/=16;
				counter--;
			}
		}

		System.out.print("Das Ergebnis ist ");
		counter++;
		for (;counter<100;counter++)
		{
			System.out.print(erg[counter]);
		}
			
	}
}
