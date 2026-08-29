package practicegit1;

public class nine {

	public static void main(String[] args) {
		//Son farm=new Son();//Overriding
		//farm.farming();
		Father farm=new Son();//Polymorphic object (DMD)
		farm.farming();
		//Father farm=new Father();
		//farm.farming();

	}

}
class Father
{
	public void farming()
	{
		System.out.println("Use traditional livestock");
	}
	public void irrigation()
	{
		System.out.println("Traditional approach");
	}
}
class Son extends Father
{
	public void farming()
	{
		System.out.println("Mechanisation: tractors");
	}
}
