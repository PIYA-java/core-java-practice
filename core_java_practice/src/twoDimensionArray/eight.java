package twoDimensionArray;

public class eight {

	public static void main(String[] args) {
		int [][]a= {{10,21},{30,45}};
		int even=0,odd=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				{
					even++;
				}
				else
				{
					odd++;
				}
			}
		}
		System.out.println("Even ="+even);
		System.out.println("Odd ="+odd);

	}

}
