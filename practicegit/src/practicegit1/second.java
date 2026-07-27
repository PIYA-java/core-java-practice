package practicegit1;

public class second {

	public static void main(String[] args) {
		
		        Actor actor = new Actor();
		        actor.name="Ranveer Singh";
		        actor.age=39;
		        actor.nationality="Indian";
		        actor.display();
		    }

	}


 class Actor {
    String name;
     int age;
    String nationality;

    
   
   
    	public void display() {
            System.out.println("Actor Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Nationality: " + nationality);
    	}
    
 }

 
   

   
   
