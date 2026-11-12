package oneDimensionArray;

public class thirteen {

	public static void main(String[] args) {
		int []a= {10,20,30,5,40,20};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			min=a[i];
			
		}
System.out.println("Minimum :"+min);



	}

}
