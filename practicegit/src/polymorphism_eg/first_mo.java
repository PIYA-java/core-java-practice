package polymorphism_eg;

		class Calculator {
	
		    int add(int a, int b) {
		        return a + b;
		    }

	
		    int add(int a, int b, int c) {
		        return a + b + c;
		    }

		   
		    double add(double a, double b) {
		        return a + b;
		    }
		}
		        public class first_mo {

		        	public static void main(String[] args) {

		        Calculator calc = new Calculator();
int a=calc.add(5,10);
		       		        System.out.println(a);     		        
	int b=calc.add(5, 10, 15);	       
		        System.out.println(b);  
		double c=calc.add(5.5, 4.5);        
		        		        System.out.println(c);  
		    }
		

	}


