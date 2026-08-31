package branching2;

public class twentyfour {

	public static void main(String[] args) {
		String password="java123";
		String entered="java123";
		int attempts=3;
		if(entered.equals(password))
			System.out.println("Login Successful");
		else if(attempts==0)
			System.out.println("Account Locked");
		else
			System.out.println("Wrong Password");
	}

}
