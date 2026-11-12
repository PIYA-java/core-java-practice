package twoDimensionArray;

public class nine {

	public static void main(String[] args) {
		int [][]a= {{10,-20},{-30,40}};
		int positive=0,negative=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>0)
					positive++;
				else
					negative++;
			}
		}
		System.out.println("Positive ="+positive);
		System.out.println("Negative ="+negative);

	}

}
