package branching2;

public class twentysix {

	public static void main(String[] args) {
		int unit=350;
		double bill;
		if(unit<=100)
			bill=unit*2;
		else if(unit<=300)
			bill=unit*3;
		else
			bill=unit*5;
if(bill>1000)
	bill=bill+(bill*0.10);
System.out.println("Total Bill = " + bill);
	}

}
