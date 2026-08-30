package loops;

public class twentyfour {

	public static void main(String[] args) {
		int i=1234;
		int reverse=0;
		do
		{
			int rem=i%10;
			reverse=reverse*10+rem;
			i=i/10;
		}
		while(i>0);
			System.out.println(reverse);
	}

}
