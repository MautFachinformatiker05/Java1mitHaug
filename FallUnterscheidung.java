
public class FallUnterscheidung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int zahl1=15;
		int zahl2=7;
		
		//1. Version
		//Angabe nur einer Variablen
		//diese Variable muss ein nummerischer Ganzzahl Datentyp sein
		// z.b int
		// oder char
		//ab JDK 1.7 ist auch String möglich
		switch  (zahl1)
		{
		case 1 :
			System.out.println("zahl1=1");
			break; //Abschluss des case Zweiges
		case 2:
			System.out.println("zahl1=2");
			break;
			default:
				System.out.println("zahl1 hat einen anderen Wert");
		}
		
		String name ="meier";
		
		switch (name)
		{
		case "meier":
			System.out.println("Der String ist Meier");
			break;
		}
		
		char zeichen = 'X';
		
		switch (zeichen)
		{
		case 'X':
			System.out.println("Das Zeichen ist ein X");
			break;
			
		}
		
		int monat=2;
		int letzterTag=0;
		
		switch(monat)
		{
			//alle Monate mit 31 Tagen
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			letzterTag =31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			letzterTag =30;
			break;
		case 2:
			letzterTag =28;
			break;
		}
		System.out.println("Letzter Tag "+letzterTag);
	}

}
