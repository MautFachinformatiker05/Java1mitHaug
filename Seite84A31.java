package Schleifen;

import java.util.Scanner;

public class Seite84A31 {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		int zahl = cs.nextInt();
		int div = 10;
		int erg = 0;
		cs.close();
		
		for (div=10;zahl/div!=0;div*=10);
		for (div=div;div!=1;div/=10)
		{
			erg+= zahl%10;
			zahl/=10;
		}
		System.out.println(erg);
	}

}
