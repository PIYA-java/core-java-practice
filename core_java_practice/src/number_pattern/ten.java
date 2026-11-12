package number_pattern;

public class ten {

	public static void main(String[] args) {
		int num=25;
		int square=num*num;
		int temp=num;
		int divisor=1;
		while(temp>0)
		{
			divisor*=10;
			temp/=10;
		}
		if(square%divisor==num)
			System.out.println("Autographic Number");
		else
			System.out.println("Not autographic number");

	}

}
