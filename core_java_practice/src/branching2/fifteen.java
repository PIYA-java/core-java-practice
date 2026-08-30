package branching2;

public class fifteen {

	public static void main(String[] args) {
		int a=20,b=10,c=15;
		if((a>b && a<c)||(a<b && a>c))
			System.out.println("Middle " + a);
		else if((b<a && a>c)||(b>a && b<c))
			System.out.println("Middle " + b);
		else
			System.out.println("Middle " + c);
	}

}
