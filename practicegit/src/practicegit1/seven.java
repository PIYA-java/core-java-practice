package practicegit1;

public class seven {

	public static void main(String[] args) {
		
A.course();

A a=new A();
a.student();
	}

}
class A
{
	static String teacher="ABC";
	String name="XYZ";
	  
	static void course()
	{
		//System.out.println(name);
	System.out.println("Teacher "+teacher);
	
	}
	
	void student()
	{
		System.out.println(teacher);
		System.out.println("Students "+name);
	}
}