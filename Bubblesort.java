package arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sortieren der Zahlen (Bubble Sort)
		
		int [] zahlen = {23,1,7,99,45,22};
				
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if (zahlen[j] > zahlen[j+1])
				{
					int temp = zahlen [j];
					zahlen[j]=zahlen[j+1];
					zahlen[j+1]=temp;
				}
			}


		}
		for (int iausgabe:zahlen)
			System.out.println(iausgabe);

	}

}
