
public class BruttoLohn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stundenzahl =40;
		double stundenlohn =10.5;
		int steuersatz =25 ;
		double bruttolohn,steuerbetrag,nettolohn;
		bruttolohn = stundenzahl * stundenlohn;
		steuerbetrag = bruttolohn * (steuersatz/100.);
		nettolohn=bruttolohn-steuerbetrag;
		System.out.printf("Der Bruttolohn ist %.2f\nder Steuerbetrag ist %.2f \nund der nettolohn ist %.2f",bruttolohn,steuerbetrag,nettolohn);
		

	}

}
