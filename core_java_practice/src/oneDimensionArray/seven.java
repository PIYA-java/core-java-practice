package oneDimensionArray;

public class seven {

	public static void main(String[] args) {
		int []a= {10,-5,0,20,-8,0,15};
		int positive=0;
		int negative=0;
		int zero=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
				positive++;
			else if(a[i]<0)
				negative++;
			else
				zero++;
		}
		System.out.println("POSITIVE="+positive);
		System.out.println("NEGATIVE="+negative);
		System.out.println("ZERO="+zero);

	}

}
