package Arrays;

import java.util.Scanner;

public class Seite91A8 {

	public static void main(String[] args) {

		System.out.println("Bitte geben sie die Teilnehmer der Klasse ein.\nEs sind 8 Teilnehmer.\nGeben Sie danach eine Nummer ein.");
		String[] namen = new String [8];
		int[] nummer = new int [8] ;
		
		for (int i=0;i<8;i++)
		{
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			namen[i] = name;
			int intr = sc.nextInt();
			nummer[i] = intr;
		}
		
		for (int i=0;i<8;i++) {
			if (namen[i] != null) {
				System.out.printf("%s, Alter %d\n",namen[i],nummer[i]);
			}
				
		}

	}

}
