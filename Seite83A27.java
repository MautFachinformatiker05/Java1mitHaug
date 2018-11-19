package Schleifen;

public class Seite83A27 {

	public static void main(String[] args) {

		// Tannenbaum
		for (int i=0;i<16;i+=2)
		{
			for (int n=16;i<n;n-=2)
				System.out.print(" ");
			
			for (int x=0;i>=x;x++)
				System.out.print("^");
			System.out.println();
		}
		
		for (int i=0; i<3; i++)
			System.out.println("       |||");

	}
}