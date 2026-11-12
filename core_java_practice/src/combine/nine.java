package combine;

public class nine {

	public static void main(String[] args) {
		int num=123456;
		int even=0,odd=0;
		do
		{
			int rem=num%10;
			if(num%2==0)
			even++;
			else
				odd++;
			num=num/10;
		}while(num>0);
		System.out.println("Even Digits = "+even);
		System.out.println("Odd Digits = "+odd);

	}

}
