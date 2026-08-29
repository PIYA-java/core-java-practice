package polymorphism_eg;


		class students {
		    void study() {
		        System.out.println("Student is studying");
		    }
		}

	
		class MCAStudent extends students {
		    @Override
		    void study() {
		        System.out.println("MCA student is studying JAVA");
		    }
		}

	
		class MBAStudent extends students {
		    @Override
		    void study() {
		        System.out.println("Medical student is studying Management.");
		    }
		}

		public class third_dmd {

			public static void main(String[] args) {
		        students s1 = new students();
		        
		        
		        students s2 = new MCAStudent();
		        students s3 = new MBAStudent();

		       		        s1.study(); 		  
		       		        s2.study(); 
		                    s3.study();
		    }
		}


	


