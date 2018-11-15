import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Flaeche {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Bitte geben sie einen wert ein");
		//double r =Double.parseDouble(br.readLine());
		
		// Eingabe eines Intgers für den Radius
		Scanner sc = new Scanner(System.in);
		
		// int radius = sc.nextInt();
		
		// Achtung !!! bie double Eingabe mit , nicht mit .
		double r = sc.nextDouble();
		
		
				
		
		
		
		final double pi = Math.PI;
		
		double erg=0;
		
		erg=(r*r)*pi;
		System.out.printf("Die Flache ist %10.3f  ",erg);
	}
}
