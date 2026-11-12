package twoDimensionArray;

public class seventeen {

	public static void main(String[] args) {
		int [][]a= {{10,50,20},
				{60,30,40},
				{15,90,25}};
		for(int i=0;i<a.length;i++)
		{
			int largest=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>largest)
					largest=a[i][j];
			}
		
			System.out.println("Largest="+largest);
		}
	}

}
