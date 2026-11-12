package combine;

public class fifteen {

	public static void main(String[] args) {
		int num1=24;
		int num2=36;
		int lcm=(num1>num2)?num1:num2;
		do {
			if(lcm%num1==0 && lcm%num2==0)
			{
				break;
			}
			lcm++;
		}while(true);
		System.out.println("LCM ="+lcm);
	}

}
