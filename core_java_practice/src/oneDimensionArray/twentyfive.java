package oneDimensionArray;

public class twentyfive {

	public static void main(String[] args) {
		int []a= {1,2,3,2,1};
		int count=0;
		for(int i=0;i<a.length/2;i++) {
			if(a[i]==a[a.length-1-i])
			{
				count++;
			}
			
		}
		if(count==a.length/2)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
