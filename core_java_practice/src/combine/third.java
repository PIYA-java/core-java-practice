package combine;

public class third {

	public static void main(String[] args) {
		int num=987654;
		int count=0;
		do
		{
			count++;
			num=num/10;
		}while(num>0);
		System.out.println("Total Digits = " + count);

	}

}
