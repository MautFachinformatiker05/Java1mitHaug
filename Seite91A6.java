package Arrays;

import java.util.Scanner;

public class Seite91A6 {					// Array1

	public static void main(String[] args) {

		System.out.println("Bitte geben sie die Teilnehmer der Klasse ein.\nEs sind 8 Teilnehmer.");
		String[] namen = new String [8];
		int index = 0;
		
		while (true)
		{
			if (index > 7)
				break;
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			namen[index] = name;
			index++;
		}
		for (String s : namen) {
			if (s != null)
				System.out.println(s);
		}

	}

}
