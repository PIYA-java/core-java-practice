package combine;

public class twelve {

	public static void main(String[] args) {
		
		int num=58329;
		int largest=0;
		do {
			int rem=num%10;
			if(rem>largest)
				largest=rem;
			num=num/10;
				}while(num>0);
		System.out.println("Largest ditits = "+largest);
		}
}