package combine;

public class four {

	public static void main(String[] args) {
		int num=18;
		int i=2;
		boolean isPrime=true;
		do
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
			i++;
		}while(i<=num/2);
		{
		if(num==1)
			isPrime=false;
		if(isPrime)
		{
		System.out.println("Prime Number");	
		}
		else
		{
			System.out.println("Not prime number");
		}
		}

	}

}
