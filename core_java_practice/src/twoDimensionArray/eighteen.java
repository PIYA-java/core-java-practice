package twoDimensionArray;

public class eighteen {

	public static void main(String[] args) {
		int [][]a= {{10,50,20},
				{60,30,40},
				{15,90,25}};
		for(int j=0;j<a[0].length;j++)
		{
			int smallest=a[0][j];
			for(int i=0;i<a.length;i++)
			{
				if(a[i][j]<smallest)
					smallest=a[i][j];
			}
		
			System.out.println("Smallest="+smallest);
		}

	}

}
