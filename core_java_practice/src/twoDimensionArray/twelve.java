package twoDimensionArray;

public class twelve {

	public static void main(String[] args) {
		int [][]a= {{10,20},{30,40}};
		int [][]b= {{1,2},{3,4}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]-b[i][j]+" ");
			System.out.println();
		}


	}

}
