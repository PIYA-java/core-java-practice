package practicegit1;

public class third {
	
		public static void main(String[] args) {
			  Student student1 = new Student();

	          student1.name = "Priya";
	          student1.course = "MCA";
	  student1.rollNumber = 101;
	  student1.marks = 83;

	          student1.displayDetails();


		}
		
	}
	class Student {
	    
	    String name;
	    String course;
	    int rollNumber;
	    int marks;

	    
	    void displayDetails() {
	        System.out.println("Student Name : " + name);
	        System.out.println("Couese : " + course);
	        System.out.println("Roll Number : " + rollNumber);
	        System.out.println("Marks : " + marks);
	    }

	}

	        
	                  






