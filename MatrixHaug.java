package arrays;

public class MatrixHaug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = new int [10][10];
		int k=1;
		
		for (int i=0;i<10;i++)
			for (int j=0;j<10;j++)
				matrix[i][j]=k++;
		
		int summe =0;
		//gesamtsumme

		for (int i=0;i<10;i++)
			for (int j=0;j<10;j++)
				summe+=matrix[i][j];
		
		// Summe Oberhalb
		System.out.println("Gesamtsumme "+summe);
		summe=0;
		for (int i=0;i<10;i++)
			for (int j=i+1;j<10;j++)
				summe+=matrix[i][j];
			
			System.out.println("Summe oberhalb "+summe);
			
			// Summe Unterhalb
			summe=0;
			for (int i=0;i<10;i++)
				for (int j=0;j<i;j++)
					summe+=matrix[i][j];
			System.out.println("Summer unterhalb "+summe);
			
			// Diagonale
			summe=0;
			for (int i=0;i<10;i++)
				
					summe+=matrix[i][i];
			System.out.println("Summe diagonale "+summe);
			

		
		
				
			
		
	}

}
