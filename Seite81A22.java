package Schleifen;

import java.util.Scanner;

public class Seite81A22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Geben sie ein Wort ein, um es gegen die Rechtschreibreform zu prüfen.");
		String wort = sc.next() + "   ";
		sc.close();
		
		for (int i=0;i<wort.length();i++)
		{	if (wort.charAt(i) == ' ')
				break;
			if (wort.charAt(i)==wort.charAt(i+1))
				if (wort.charAt(i+1)==wort.charAt(i+2))
					if (wort.charAt(i+2)==wort.charAt(i+3))
						{
							System.out.println("UNZULÄSSIG");
							break;
						}
		}
		
		
	}

}
