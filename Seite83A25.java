package Schleifen;

public class Seite83A25 {

	public static void main(String[] args) {

		// S�gezahnblatt

//		for (int i=0;i<9;i+=2)
//		{
//			for (int x=0;i>=x;x++)
//				System.out.print("*");
//			System.out.println();
//		}
//		
//		
		// Die wohl bessere L�sung f�r sowas
		
		String stern = "*";
		
		for (int i=0;i<5;i++)
		{
			System.out.println(stern);
			stern = stern + "**";
		}

	}
}