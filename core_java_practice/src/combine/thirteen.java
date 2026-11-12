package combine;

public class thirteen {

	public static void main(String[] args) {
		int num=10020030;
		int count=0;
		do {
			int rem=num%10;
			if(rem==0)
				count++;
			num=num/10;
		}while(num>0);
		System.out.println("number of zeroes = "+count);
	}
}
