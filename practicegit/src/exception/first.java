package exception;

public class first {

	public static void main(String[] args) {
		int age=21;
		try
		{
			if (age<18)
			{
				throw new Exception("Under age");
			}
			else
			{
				System.out.println("Please vote");
			}
		}
		catch(Exception ex)
		{
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("Hello");
		System.out.println("Good Evening");
	}

}
