package arith;

public class first100prime {
	public static void main(String args[])
	{
		int counter=0;
		int no=2;

		while(counter<100)
		{
			boolean flag=true;
		
			
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				
			}
		}
			if(flag)
			{
		
		counter++;
		System.out.println(no);
			}
			no++;
		}
		System.out.println("counter"+counter);
		System.out.println("number"+no);
		

	}
	}


	


