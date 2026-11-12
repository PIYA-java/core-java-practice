package number_pattern;

public class seven {

	public static void main(String[] args) {
		int a=12;
		int b=18;
		for(int i=(a>b?a:b);  ;i++)
		{
		if(i%a==0 && i%b==0)
		{
		System.out.println("LCM ="+i);	
		break;
		}
		}

	}

}
