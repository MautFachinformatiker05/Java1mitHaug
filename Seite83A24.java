package Schleifen;

public class Seite83A24 {

	public static void main(String[] args) {

		// Spielautomat
		
		int guthaben = 10;
		
		while (guthaben>0)
		{
			int zahl1 = (int)(Math.random()*10);
			int zahl2 = (int)(Math.random()*10);
			int zahl3 = (int)(Math.random()*10);
			
			if (zahl1==zahl2 && zahl2==zahl3)
			{
				guthaben+=9;
				System.out.println(zahl1+"\t"+zahl2+"\t"+zahl3+"\t10 Münzen\t Guthaben: "+guthaben+" Münzen");
			}
			
			if (zahl1==zahl2 || zahl2==zahl3)
			{
				guthaben+=2;
				System.out.println(zahl1+"\t"+zahl2+"\t"+zahl3+"\t3  Münzen\t Guthaben: "+guthaben+" Münzen");
			}
			
			if (zahl1!=zahl2 && zahl2!=zahl3)
			{
				guthaben-=1;
				System.out.println(zahl1+"\t"+zahl2+"\t"+zahl3+"\tVerloren!\t Guthaben: "+guthaben+" Münzen");
			}
		}

	}

}
