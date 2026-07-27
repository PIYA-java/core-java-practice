package practicegit1;

public class six {

	public static void main(String[] args) {
		Methods m=new Methods();
		m.display();
		int a=m.shows();
		System.out.println(a);

	}

}
class Methods
{
	public void display()
	{
		System.out.println("Hello ");
	}
	public int shows()
	{
	return 10*10;	
	}
}