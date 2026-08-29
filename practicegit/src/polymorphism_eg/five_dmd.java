package polymorphism_eg;

		
		class Calculation {
		   
		    public void calculate(double a, double b) {
		        System.out.println("No operations defined in the base class.");
		    }
		}

		
		class Addition extends Calculation {
		    @Override
		    public void calculate(double a, double b) {
		        System.out.println("Addition: " + (a + b));
		    }
		}

		
		class Subtraction extends Calculation {
		    @Override
		    public void calculate(double a, double b) {
		        System.out.println("Subtraction: " + (a - b));
		    }
		}

				class Multiplication extends Calculation {
		    @Override
		    public void calculate(double a, double b) {
		        System.out.println("Multiplication: " + (a * b));
		    }
		}

		
				public class five_dmd {

					public static void main(String[] args) {

		        		        Calculation calc;

		        double num1 = 12.0;
		        double num2 = 4.0;

		        System.out.println(" arithmetic operations ");

		        		        calc = new Addition();
		        calc.calculate(num1, num2); 
		       		        calc = new Subtraction();
		        calc.calculate(num1, num2); 

		        
		        calc = new Multiplication();
		        calc.calculate(num1, num2); 
		    }
		}

	
