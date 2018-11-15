import java.util.Scanner;

public class Wechselgeld2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bitte geben sie das Wechselgeld in Cent ein");
		Scanner sc = new Scanner(System.in);
		int cent = sc.nextInt();
		
		System.out.printf("Das Wechselgeld ist :\n");
		
		System.out.printf("%d Euro\n",cent/100);
		cent = cent % 100; // Überschrieben der Variablen Cent mit dem Rest
		
		System.out.printf("%d 50-Cent\n",cent/50);
		cent = cent % 50;
		
		System.out.printf("%d 20-Cent\n",cent/20);
		cent = cent % 20;
		
		System.out.printf("%d 10-Cent\n",cent/10);
		cent = cent % 10;
		
		System.out.printf("%d 5-Cent\n",cent/5);
		cent = cent % 5;
		
		System.out.printf("%d 2-Cent\n",cent/2);
		cent = cent % 2;
		
		System.out.printf("%d 1-Cent\n",cent);
		
		
	}

}
