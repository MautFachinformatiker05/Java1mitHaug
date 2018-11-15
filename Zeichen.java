import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeichen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Geben sie eine Zeichenkette mit 5 Zeichen ein");
		String eingabe=br.readLine();
		System.out.println(eingabe.charAt(1));
		


	}

}
