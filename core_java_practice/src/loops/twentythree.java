package loops;

public class twentythree {

	public static void main(String[] args) {
		int num=1234;
		int count=0;
		do
		{
			count++;
			num=num/10;
		}
		while(num>0);
		System.out.println(count);

	}

}
