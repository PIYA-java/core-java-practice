package branching2;

public class thirteen {

	public static void main(String[] args) {
		int year=2028;
		if((year%400==0)||(year%4==0 && year%100==0))
			System.out.println(" leap year ");
		else
			System.out.println(" not leap year ");

	}

}
