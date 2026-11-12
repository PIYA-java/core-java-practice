package oneDimensionArray;

public class fifteen {

	public static void main(String[] args) {
		int []a= {10,50,30,40,20};
		int smallest=a[0];
		int second=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				second=smallest;
				smallest=a[i];
			}
			
			else if (a[i]<second && a[i]!=smallest)	
			{
				second=a[i];
			}
		}
System.out.println("second largest "+second);

	}

}
