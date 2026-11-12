package number_pattern;

public class first {

	public static void main(String[] args) {
	int num=123;
	int original=num;
	int reverse=0;
	for(;num>0;num=num/10)
	{
		int rem=num%10;
		reverse=reverse*10+rem;
	}
	if(original==reverse)
	{
		System.out.println("Palindrome number");
	}
	else
	{
		System.out.println("Non palindrome number");
	}
	}

}
