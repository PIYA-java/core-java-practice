package twoDimensionArray;

public class sixteen {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},
			    {2,4,5},
			    {3,5,6}};
	boolean symmentric=true;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i][j]!=a[j][i])
				symmentric=false;
			
		}
	}
	if(symmentric)
		System.out.println("Symmentric matrix");
	else
	System.out.println("Non symmetric matrix");
			}

	}


