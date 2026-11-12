package oneDimensionArray;

public class ten {

	public static void main(String[] args) {
		int []a= {10,20,30,40,20};
		int search=20;
		int last=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				last=a[i];		
				}
			
		}
System.out.println("Last occurance :"+last);

	}

}
