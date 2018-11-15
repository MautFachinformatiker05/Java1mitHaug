import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int schalt = 0;
		System.out.println("Geben sie eine Jahreszahl nach Christus an.");
		schalt = sc.nextInt();
		
		if (schalt%400==0 || schalt%4==0 && schalt%100!=0)
			System.out.println("Dieses Jahr ist ein  Schaltjahr.");
		else
			System.out.println("Dieses Jahr ist kein Schaltjahr.");
		sc.close();	
	}

}
