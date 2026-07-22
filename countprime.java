package arith;

public class countprime {
	public static void main(String args[])
	{
		int counter=0;
		int sum=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i==1)
			{
				continue;
				
			}
			boolean flag=false;
		
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
		flag=true;
			}
		}
		if(flag)
		{
			System.out.println("Not Prime"+i);
		}
		else
		{
			counter++;
			System.out.println("Prime"+i);
			sum +=i;
		}
		}
		System.out.println("counter"+counter);
		System.out.println(sum);
	}

}
