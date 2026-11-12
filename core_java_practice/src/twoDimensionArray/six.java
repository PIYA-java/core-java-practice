package twoDimensionArray;

public class six {

	public static void main(String[] args) {
		int [][]a= {{10,20},{30,40}};
		for(int j=0;j<a[0].length;j++)
		{
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i][j];
			}
			System.out.println("Row sum="+sum);
		}
	}

}
