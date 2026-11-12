package oneDimensionArray;

public class twentynine {

	public static void main(String[] args) {
		int []a= {1,2,3,5};
		int n=5;
		int total=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int missing=total-sum;
		System.out.println("Missing number ="+missing);
	}

		}


