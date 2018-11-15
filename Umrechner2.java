import java.util.Scanner;

public class Umrechner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int geld = sc.nextInt();
		
		int cent= geld % 100;
		int euro = geld /100; // Ausnutzung der Integer Division
		System.out.println("Euro : "+euro+"\nCent : " +cent);

	}

}
