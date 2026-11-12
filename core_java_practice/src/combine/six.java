package combine;

public class six {

	public static void main(String[] args) {
		int num=154;
		int original=num;
		int sum=0;
		do
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}while(num>0);
		if(sum==original)
	    System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");

	}

}
