package Arrays;

public class Seite92A12 {

	public static void main(String[] args) { // Lottozahlen von nächstem Samstag
		//System.out.println((int)(Math.random()*49+1));
		int[] lotto = new int[6];
		
		_anfang:for(int i=0;i<6;i++)
		{
			lotto[i]= (int)(Math.random()*49+1);
			for (int x=i-1;x>=0;x--)
			{
				if (lotto[x]==lotto[i])
				{
					i--;
					continue _anfang;
				}
			}
		}
		
		System.out.println("Die Lottozahlen sind: "+lotto[0]+"  "+lotto[1]+"  "+lotto[2]+"  "+lotto[3]+"  "+lotto[4]+"  "+lotto[5]);
		
	}

}
