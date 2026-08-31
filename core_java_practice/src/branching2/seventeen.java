package branching2;

public class seventeen {

	public static void main(String[] args) {
		int month=8;
		switch(month)
		{
		case 12 :case 1 : case 2 : System.out.println("Winter");
		break;
		case 3 : case 4 : case 5 : System.out.println("Summer");
		break;
		case 6 : case 7 : case 8 : System.out.println("Mansoon");
		break;
		case 9 : case 10 : case 11 : System.out.println("Autum");
		break;
		default : System.out.println("invalid month");
		}
	}

}
