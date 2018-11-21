package arrays;

import java.util.Scanner;

public class Umrechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl = 0;
		int [] endzahl = new int [100];
		int umrechung=0;
		int counter =0;
		boolean schalter = false;
		char hex = ' ';
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Bitte zahl zum umrechnen eingeben");
		zahl=sc.nextInt();
		System.out.println("Wollen sie in (b)inär, (h)ex oder (o)ktal umrechnen?");
		char parameter = sc.next().toLowerCase().charAt(0);
		switch (parameter)
		{
		case 'b':
			umrechung=2;
			break;
		case 'h':
		
		umrechung=16;
		break;
		case 'o':
		umrechung=8;
		break;
		default:
			System.out.println("fehlerhafte eingabe");
		
		}
		
		while (zahl>0)
		{
		 endzahl[counter]=zahl%umrechung;
		 zahl /=umrechung;
		 counter++;
		}

		
		
	for (int i =99;i>=0;i--)
	{
			if (endzahl[i]!=0)
				schalter=true;
			if  (schalter)
			{
			 if (endzahl[i]>9)
			 {
				hex =(char)(65+ endzahl[i]%10);
				System.out.print(hex);
			 }
				
			
			 else
			System.out.print(endzahl[i]);
			
			
			}
			
	}

}
}