package combine;

public class five {

	public static void main(String[] args) {
		int a=0,b=1;
		int count=0;
		do
		{
			System.out.println(a+ " ");
			int c=a+b;
			a=b;
			b=c;
			count++;
		}while(count<=10);
	}

}
