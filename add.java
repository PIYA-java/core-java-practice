package arith;

public class add {
	public static void main(String args[])
	{
		double marks=80.92;
	if(marks<=40 && marks>=60)
		{
		System.out.println("A");
		}
	else if(marks<=61 && marks>=80)
	{
		System.out.println("B");
	}
	else if(marks<=81 && marks>=100)
	{
		System.out.println("C");
	}
	else
	{
		System.out.println("Fail or invalid");
	}

	}
}
