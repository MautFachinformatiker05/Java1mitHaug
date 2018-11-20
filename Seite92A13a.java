package Arrays;

import java.util.concurrent.TimeUnit;

public class Seite92A13a {

	public static void main(String[] args) {

		int[] liste = new int [1842];
		int stelle = 0;
		for (int i = 6;i<=17689;i++)
		{
			if (i%6==0)
				if (i%12==0)
				{
					if (i%48==0) {
						System.out.println("Mitarbeiter "+i);
						liste[stelle] = i;
						
					}
				}
				else {
					System.out.println("Mitarbeiter "+i);
					liste[stelle] = i;
				}


		}
		
	}

}
