package oneDimensionArray;

public class eleven {

	public static void main(String[] args) {
		int []a= {10,20,10,30,10,40};
		int search=10;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				count++;	
				}
			
		}
System.out.println("occurance :"+count);

	}

}
