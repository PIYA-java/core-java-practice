package ThreeDimensionArray;

public class four {

	public static void main(String[] args) {
		int [][][]a= {{
			{10,20},
			{30,40}},
				{{50,60},
				{70,80}}};
		int smallest=a[0][0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					if(a[i][j][k]<smallest)
						smallest=a[i][j][k];
				}
			}
		}
		System.out.println("smallest="+smallest);

	}

}
