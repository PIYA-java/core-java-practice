package number_pattern;

public class eight {

	public static void main(String[] args) {
		int num=146;
		int original=num;
		int sum=0;
		for(;num>0;num=num/10)
		{
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
		}
		if(sum==original)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not strong number");
		}

	}

}
