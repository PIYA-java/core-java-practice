package polymorphism_eg;

		class Animal {
		    void makeSound() {
		        System.out.println("Animal makes a sound");
		    }
		}

		class Dog extends Animal {
		    @Override
		    void makeSound() {
		        System.out.println("Dog barks");
		    }
		}

		public class first_dmd {

			public static void main(String[] args) {

		        
		        Animal myAnimal = new Dog(); 
		        myAnimal.makeSound(); // DMD 		    }
		}

	}


