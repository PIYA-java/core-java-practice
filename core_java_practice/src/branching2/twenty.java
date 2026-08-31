package branching2;

public class twenty {

	public static void main(String[] args) {
		int a=10,b=50,c=20,d=40,e=30;
		if(a>=b && a>=c && a>=d && a>=e)
			System.out.println(a + " is greater");
		else if(b>=c && b>=d && b>=e)
			System.out.println(b + " is greater");
		else if(c>=d && c>=e)
			System.out.println(c + " is greater");
		else if(d>=e)
			System.out.println(d + " is greater");
		else
			System.out.println(e + " is greater");
	}

}
