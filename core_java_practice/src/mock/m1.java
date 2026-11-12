package mock;

public class m1 {

	public static void main(String[] args) {
		
abc a= new xyz();
a.display();

	}

}
class abc 
{
	public void display()
	{
		System.out.println("Hello");
	}
}
class xyz extends abc
{
	public void display()
	{
		System.out.println("How are you");
	}
}
