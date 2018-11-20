package Arrays;

import java.util.Scanner;

public class Seite92A14 {

public static void main(String[] args) {
		
		System.out.println("Sie können bis zu 3 Eingaben tätigen!");
		String[] text = new String [3];
		Scanner sc = new Scanner(System.in);
		text[0] = sc.next();
		text[1] = sc.next();
		text[2] = sc.next();
		sc.close();
		int erg = 0;
		
		for (int x = 0;x<3;x++) {
			for (int i = 0;i<text[x].length();i++) {
				if (text[x].toLowerCase().charAt(i) == 'a')
					erg++;
			}
		}
		System.out.println("Die Zahl der a oder A: "+erg);

	}

}
