package twoDimensionArray;

public class five {

	public static void main(String[] args) {
		int [][]a= {{10,20},{30,40}};
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println("Row sum="+sum);
		}

	}

}
