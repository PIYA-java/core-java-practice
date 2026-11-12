package twoDimensionArray;

public class four {

	public static void main(String[] args) {
		int [][]a= {{10,50},{30,20}};
		int smaller=a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			if(a[i][j]<smaller)
			{
				smaller=a[i][j];
			}
			}
		}
		System.out.println("Smaller="+smaller);

	}

}
