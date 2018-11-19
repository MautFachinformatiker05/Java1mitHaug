package Schleifen;

import java.util.concurrent.TimeUnit;

public class Seite81A18 {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 6;i<=17689;i++)
		{
			TimeUnit.MILLISECONDS.sleep(10);
			if (i%6==0)
				if (i%12==0)
				{
					if (i%48==0)
						System.out.println("Mitarbeiter "+i);
				}
				else System.out.println("Mitarbeiter "+i);
			
				
		}

	}

}
