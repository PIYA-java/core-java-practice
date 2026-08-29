package practicegit1;

public class eight {

	public static void main(String[] args) {
	city c=new city(12);
}
	}
class city
{
	public city()
	{
		this(10,20);
		System.out.println("C");
	}
	public city(int a)
	{
		this();
		System.out.println("B");
	}
	public city(int i,int j)
	{
	    System.out.println("A");
	}
}