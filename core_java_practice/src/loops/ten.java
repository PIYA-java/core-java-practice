package loops;

public class ten {

	public static void main(String[] args) {
		int num=161;
		int original=num;
		int reverse=0;
		while(num>0)
		{
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		if(original==reverse)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
