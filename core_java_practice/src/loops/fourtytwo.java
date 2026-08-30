package loops;

public class fourtytwo {

	public static void main(String[] args) {
		int num=1234;
		int reverse=0;
		for(;num>0;num=num/10)
		{
		int rem=num%10;
		reverse=reverse*10+rem;
		}
		System.out.println("Reverse = "+reverse);

	}

}
