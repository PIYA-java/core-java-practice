package loops;

public class fourty {

	public static void main(String[] args) {
		int even=0;
		int odd=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even = "+even);
		System.out.println("Odd = "+odd);
	}

}
