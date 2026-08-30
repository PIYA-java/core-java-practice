package branching2;

public class seven {

	public static void main(String[] args) {
		int a=10,b=40,c=25,d=30;
		if(a>=b && a>=c && a>=d)
			System.out.println(a + " is largest");
		else if(b>=c && b>=d)
			System.out.println(b + " is largest");
		else if(c>=d)
			System.out.println(c + " is largest");
		else
			System.out.println(d + " is largest");

	}

}
