package branching;

public class ten {

	public static void main(String[] args) {
		String username="admin";
		String password="1234";
		if(username.equals("admin"))
		{
			if(password.equals("1234"))
			{
				System.out.println("Login successful");
			}
			else
			{
				System.out.println("Incorrect Password");
			}
	}
		else
		{
			System.out.println("Invalid username");
		}
	

	}

}
