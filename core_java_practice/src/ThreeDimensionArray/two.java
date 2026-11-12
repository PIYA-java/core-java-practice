package ThreeDimensionArray;

public class two {

	public static void main(String[] args) {
		int [][][]a= {{
			{10,20},
			{30,40}},
				{{50,60},
				{70,80}}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					sum+=a[i][j][k];
				}
			}
		}
		System.out.println("Sum="+sum);

	}

}
