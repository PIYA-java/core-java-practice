package oneDimensionArray;

public class twentyseven {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				evenSum+=a[i];
			else
				oddSum+=a[i];
		}
		System.out.println("Even index sum="+evenSum);
		System.out.println("Odd index sum="+oddSum);

	}

}
