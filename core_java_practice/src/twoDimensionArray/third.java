package twoDimensionArray;

public class third {

	public static void main(String[] args) {
		int [][]a= {{10,50},{30,20}};
		int largest=a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			if(a[i][j]>largest)
			{
				largest=a[i][j];
			}
			}
		}
		System.out.println("Largest="+largest);


	}

}
