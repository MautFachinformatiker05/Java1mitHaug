package Arrays;

public class Zusatzaufgabe {

	public static void main(String[] args) {

		int[][] tabelle = new int[10][10];
		int z = 1;
		int alle = 0;
		int unterhalb = 0;
		int oberhalb = 0;
		int diagonale = 0;
		
		for (int i=0;i<10;i++)
		{
			for (int x=0;x<10;x++)
			{
				tabelle[i][x] = z;
				z++;
			}
		}
		
		for (int i=0;i<10;i++)
		{
			for (int x=0;x<10;x++)
			{
				alle+=tabelle[i][x];
			}
		}
		
		for (int i=0;i<10;i++)
		{
			for (int x=0;x<10;x++)
			{
				if (x<i)
					oberhalb+=tabelle[i][x];
			}
		}
		
		for (int i=0;i<10;i++)
		{
			diagonale+= tabelle[i][i];
		}
		
		unterhalb = alle - diagonale - oberhalb;
		
		System.out.println("Die Summe aller Elemente in der Tabelle: "+alle);
		System.out.println("Die Summe aller Elemente oberhalb der Hauptdiagonalen: "+oberhalb);
		System.out.println("Die Summe aller Elemente unterhalb der Hauptdiagonalen: "+unterhalb);
		System.out.println("Die Summe aller Elemente auf der Hauptdiagonalen: "+diagonale);
	}

}
