package polymorphism_eg;

		class Calculator1{
	
 
 public void add(int a, int b) {
     System.out.println("Sum: " + (a + b));
 }
}


class AdvancedCalculator extends Calculator1 {

 @Override
 public void add(int a, int b) {
     int result = a + b;
     System.out.println("Sum: " + result );
 }
}


public class fourth_dmd {

	public static void main(String[] args) {

    
     Calculator1 calc1 = new Calculator1();
     calc1.add(10, 20); 
         Calculator1 calc2 = new AdvancedCalculator();    // DMD
     
     
     calc2.add(20, 20); 
 }
}
