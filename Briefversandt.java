import java.util.Scanner;

public class Briefversandt {

	public static void main(String[] args) {

		int anzahl = 0;
		String einsch = "";
		int gewicht = 0;
		int hohe = 0;
		double preis = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Wenn Sie einen oder mehrere Briefe versenden wollen, müssen Sie zuerst mehrere Fragen beantworten.\nWie viele Briefe wollen Sie verschicken? (Antwort in Zahlen)");
		anzahl = sc.nextInt();
		System.out.println("Schicken sie die Briefe als Einschreiben? (Ja oder Nein)");
		einsch = sc.next();
		System.out.println("Wie viel wiegt ein Brief in Gramm? Sie können die Waage nebenan nutzen. (Antwort in Zahlen)");
		gewicht = sc.nextInt();
		System.out.println("Wie hoch ist ein Brief in Millimeter? (Antwort in Zahlen)");
		hohe =  sc.nextInt();
		sc.close();
		
		if (hohe>=50)
			preis = 2.20;
		
		if (hohe<=20)
			preis = 1.45;
		
		if (hohe<=10)
		{
			if (gewicht<=50)
				preis = 0.90;
			else
				preis = 1.45;
		}
		
		if (hohe<=5)
		{
			if (gewicht<=500)
				preis = 1.45;
			if (gewicht<=50)
				preis = 0.90;
			if (gewicht<=20)
				preis = 0.55;
		}
		
		if (einsch.toLowerCase().matches("(.*)j(.*)"))
			preis = preis+2.05;
		
		
		System.out.printf("Sie müssen %.2f€ für ihre %d Briefe zahlen, je %.2f€ pro Brief.",preis*anzahl,anzahl,preis);
		

	}

}
