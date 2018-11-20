package eigenVersuchSchleifenÜbungen;

public class quersumme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startwert=77;
		int quer=startwert;
		int summe =0;
		while (quer>0)
		{
			summe+=quer %10;
			quer /=10;
			
		}
		System.out.println("Die Quersumme " + startwert + " ist "+summe);

	}

}
