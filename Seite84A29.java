package Schleifen;

import java.util.Scanner;

public class Seite84A29 {

	public static void main(String[] args) {

		System.out.println("Wie viele Atome?");
		Scanner sc = new Scanner(System.in);
		int atom = sc.nextInt();
		System.out.println("Wie lang ist die Halbwertzeit in Tagen?");
		int tage = sc.nextInt();
		int i=0;
		sc.close();
		do {
			System.out.printf("Anzahl nicht zerfallener Atome nach %4d Tagen: %4d.\n",tage*i,atom);
			atom/=2;
			i++;
		} while (atom!=1);
		System.out.printf("Anzahl nicht zerfallener Atome nach %4d Tagen: %4d.\n",tage*i,atom);
	}

}
