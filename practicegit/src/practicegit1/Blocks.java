package practicegit1;

public class Blocks {

	public static void main(String[] args) {
	aeroplane aero = new aeroplane();
	
	System.out.println(aeroplane.age);
	System.out.println(aero.name);
	aeroplane aero2=new aeroplane();

	}

}
class aeroplane
{
	String name;
	static int age;
	static
	{
		age=20;
		System.out.println("This is static block ...");
	}
	
	{
		name="Piya";
		System.out.println("This is instance block ....");
	}
	public aeroplane()
	{
		System.out.println("Constructor call ...");
	}
}