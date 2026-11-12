package ThreeDimensionArray;

public class three {

	public static void main(String[] args) {
		int [][][]a= {{
			{10,20},
			{30,40}},
				{{50,60},
				{70,80}}};
		int largest=a[0][0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					if(a[i][j][k]>largest)
						largest=a[i][j][k];
				}
			}
		}
		System.out.println("largest="+largest);


	}

}
