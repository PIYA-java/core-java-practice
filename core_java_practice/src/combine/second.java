package combine;

public class second {

	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		do
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}while(num>0);
		System.out.println("Sum of digits = "+sum);
	}

}
