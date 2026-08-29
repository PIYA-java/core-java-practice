package polymorphism_eg;


		class Student {

		    public void studentId(String name, int rollNo){

		        System.out.println("Name: " + name
		                           + ", Roll-No: " + rollNo);
		    }
		    public void studentId(int rollNo, String name){
		        
		        System.out.println("Roll-No: " + rollNo
		                           + ", Name: " + name);
		    }
		}
		public class five_mo {

			public static void main(String[] args) {
		
		        
		        Student s = new Student();
		        s.studentId("Riya", 1);
		        s.studentId(2, "Siya");
		    }
		}

	
