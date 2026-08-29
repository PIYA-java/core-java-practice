package polymorphism_eg;

		class Printer {
		    
		    void display(int format) {
		        System.out.println("Printing integer: " + format);
		    }

		   
		    void display(String text) {
		        System.out.println("Printing string: " + text);
		    }
		}
		    public class second_mo {

		    	public static void main(String[] args) {

		   		        Printer obj = new Printer();
		        obj.display(1001);
		        obj.display("Hello");
		    }
		}

	
