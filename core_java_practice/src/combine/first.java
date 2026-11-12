package combine;

public class first {

	public static void main(String[] args) {
		int num=123;
		int original=num;
		int reverse=0;
		do {
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}while(num>0);
		if(original==reverse)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
