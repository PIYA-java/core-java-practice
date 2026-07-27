package practicegit1;

public class fourth {

	public static void main(String[] args) {
		
		  Employee e1 = new Employee();
	        e1.setDetails(101, "Priyanka", "IT", 35000);
	        e1.displayDetails();
	        e1.increaseSalary(5000);
	        e1.displayDetails();

	        
	        Employee e2 = new Employee();
	        e2.setDetails(102, "Rahul", "HR", 30000);
	        e2.displayDetails();
	        e2.increaseSalary(3000);
	        e2.displayDetails();
	        
	}
}
	        
	        
	        
		class Employee {

		   
		    int empId;
		    String empName;
		    String department;
		    double salary;

		    void setDetails(int id, String name, String dept, double sal) {
		        empId = id;
		        empName = name;
		        department = dept;
		        salary = sal;
		    }

		   
		    void increaseSalary(double amount) {
		        salary = salary + amount;
		        System.out.println("Salary increased by " + amount);
		    }

		   
		    void displayDetails() {
		        System.out.println("\nEmployee ID   : " + empId);
		        System.out.println("Employee Name : " + empName);
		        System.out.println("Department    : " + department);
		        System.out.println("Salary        : " + salary);
		    }
		}

		   