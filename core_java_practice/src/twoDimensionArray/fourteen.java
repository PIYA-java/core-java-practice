package twoDimensionArray;

public class fourteen {

	public static void main(String[] args) {
		int [][]a= {{10,20},{30,40}};
		int search=30;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==search)
					System.out.println("Elements Found");
				
			}
		}

	}

}
