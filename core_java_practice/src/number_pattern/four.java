package number_pattern;

public class four {

	public static void main(String[] args) {
		int num=154;
		int original=num;
		int sum=0;
		for(;num>0;num=num/10)
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==original)
		{
		System.out.println("Armstrong number");	
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}

}
