package arith;

public class forloop {
	public static void main(String args[])
	{
	
		int counter=0;
		for(int i=-100;i<=100;i++)
		{
			if(i%2==0)
			{
				counter++;
			}
		}
		System.out.println(":"+counter);
	}

}
