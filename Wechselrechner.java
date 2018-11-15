import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wechselrechner {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Geben sie das wechselgeld ein");
		int wechselgeld = Integer.parseInt(br.readLine());
		
		int _einEuro = wechselgeld /100;
		 wechselgeld=wechselgeld%100;
		
		int _fuenfzigCent = wechselgeld /50;
		wechselgeld=wechselgeld%50;
		
		int _zwanzigCent = wechselgeld /20;
		wechselgeld=wechselgeld%20;
		
		int _zehnCent = wechselgeld /10;
		wechselgeld=wechselgeld%10;
		
		int _fuenfCent = wechselgeld /5;
		wechselgeld=wechselgeld%5;
		
		int _zweiCent= wechselgeld /2;
		wechselgeld=wechselgeld%2;
		
		int _eincent=wechselgeld;
		
		System.out.println(_einEuro+" Euro");
		System.out.println(_fuenfzigCent+" 50-Cent Stück");
		System.out.println(_zwanzigCent+" 20-Cent-Stück");
		System.out.println(_zehnCent+" 10-Cent-Stück");
		System.out.println(_fuenfCent+" 5-Cent-Stück");
		System.out.println(_zweiCent+" 2-Cent-Stück");
		System.out.println(_eincent+" 1-Cent-Stück");
		
		
				
		
		
        
		

	}

}
