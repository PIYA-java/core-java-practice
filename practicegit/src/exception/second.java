package exception;

public class second {

	public static void main(String[] args) {
		int money=100000;
		try
		{
			if(money<=90000)
			{
				throw new Exception("Insufficient balance");
			}
			else
			{
				System.out.println("Wel-Come to iPhone family ");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("Hello");

	}

}
