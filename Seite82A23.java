package Schleifen;

public class Seite82A23 {

	public static void main(String[] args) {

		int sorteA = 0;
		int sorteB = 0;
		int preis = 0;
		while (true)
		{
			sorteA++;
			sorteB+=3;
			preis+=90;
			if (preis>=5000)
				break;
		}
		System.out.println("Sorte A: "+sorteA);
		System.out.println("Sorte B: "+sorteB);
		System.out.println("Preis: "+preis+"€");
	}

}
