package number_pattern;

public class nineteen {

	public static void main(String[] args) {
		int num=8;
		int square=num*num;
		int sum=0;
		while(square>0)
		{
			sum=sum+square%10;
			square=square/10;
		}
		if(sum==num)
			System.out.println("Neon");
		else
			System.out.println("Not neon");

	}

}
