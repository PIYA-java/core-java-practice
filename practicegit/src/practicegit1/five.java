package practicegit1;

public class five {

	 public static void main(String[] args) {

	       
	        ITEmployee e1 = new ITEmployee();
	        e1.empId = 235;
	        e1.empName = "Priyanka";
	        e1.salary = 35001;

	        
	        ITEmployee e2 = new ITEmployee();
	        e2.empId = 2452;
	        e2.empName = "Varsha";
	        e2.salary = 42600;

	       
	        e1.display();
	        e2.display();
	    }
	

}


		class ITEmployee {

		    
		    static String company = "TCS";

		    int empId;
		    String empName;
		    double salary;

		   
		   public void display() {
		        System.out.println("Employee ID : " + empId);
		        System.out.println("Employee Name : " + empName);
		        System.out.println("Salary : " + salary);
		        System.out.println("Company : " + company);
		        System.out.println();
		    }
		}
		   
