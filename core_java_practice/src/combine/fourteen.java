package combine;

public class fourteen {

	public static void main(String[] args) {
		int num1=24;
		int num2=36;
		int gcd=1;
		int i=1;
		do {
			if(num1%i==0 && num2%i==0)
				gcd=i;
		
		i++;

	}while(i<=num1 && i<=num2);
	System.out.println("GDC ="+gcd);

	}

}
