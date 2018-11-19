package Schleifen;

import java.util.Scanner;

public class Seite81A19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		sc.close();
		int erg = 0;
		for (int i = 0;i<text.length();i++) {
			if (text.toLowerCase().charAt(i) == 'a')
				erg++;
		}
		System.out.println("Die Zahl der a oder A: "+erg);

	}

}
