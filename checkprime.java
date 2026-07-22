package arith;

public class checkprime {
	public static void main(String args[])
	{
		int num=60;
		boolean flag=false;
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				flag=true;
				
			}
		}
		if(flag)
		{
			System.out.println("Not Prime"+num);
		}
		else
		{
			System.out.println("Prime"+num);
		}
	}

}
