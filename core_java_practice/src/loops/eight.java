package loops;

public class eight {

	public static void main(String[] args) {
		int num=1234;
		int reverse=0;
		System.out.println("Actual Number  "+num);
		while(num>0)
		{
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
			
		}
		System.out.print("Reverse number ");
		System.out.println( reverse);
	}

}
