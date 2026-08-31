package branching2;

public class nineteen {

	public static void main(String[] args) {
		// BMI[Body Mass Index]
		double weight=65;
		double height=1.70;
		double bmi=weight/(height*height);
		System.out.println("BMI = " + bmi);
		if(bmi<18.5)
			System.out.println("Underweight");
		else if(bmi<25)
			System.out.println("Normal");
		else
			System.out.println("Overweight");
	}

}
