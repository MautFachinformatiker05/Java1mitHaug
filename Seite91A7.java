package Arrays;

import java.util.Scanner;

public class Seite91A7 { //Array2

	public static void main(String[] args) {

		System.out.println("Bitte geben sie die Teilnehmer der Klasse ein.\nEs sind 8 Teilnehmer.");
		String[] namen = new String [8];
		int[] nummer = {1,2,3,4,5,6,7,8} ;
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
		index=0;
		
		for (String s : namen) {
			if (s != null) {
				System.out.printf("%s, Nummer %d\n",s,nummer[index]);
				index++;
			}
				
		}

	}

}
