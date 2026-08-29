package polymorphism_eg;

		class Multiplier {
		    
		    void multiply(int a, int b) {
		        System.out.println("Integer multiplication: " + (a * b));
		    }

		   
		    void multiply(double a, double b) {
		        System.out.println("Double multiplication: " + (a * b));
		    }
		}

		public class fourth_mo {

			public static void main(String[] args) {

		        Multiplier obj = new Multiplier();
		        obj.multiply(4, 5);
		        obj.multiply(4.5, 2.0);
		    }
		}

	
