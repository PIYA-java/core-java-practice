package practicegit1;

public class encapsul {

	public static void main(String[] args) {
		insta insta1=new insta();
		insta1.set("2345168987");
		insta1.displaypassword();
	}

}
class insta
{
	private String password;
	public void displaypassword()
	{
		System.out.println("Password :" +this.password);
	}
	public void set(String password)
	{
		if(password.length()>=10)
		{
			this.password=password;
		}
		else
		{
			System.out.println("Password must contain atleast 10 character");
		}
	}
}
