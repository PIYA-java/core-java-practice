package polymorphism_eg;


		class Vehicle {
		    void start() {
		        System.out.println("Vehicle is starting");
		    }
		}

		class Car extends Vehicle {
		    @Override
		    void start() {
		        System.out.println("Car starts");
		    }
		}

		public class second_dmd {

			public static void main(String[] args) {
		        Vehicle myVehicle = new Car(); // DMD
		        myVehicle.start(); 
		    }
		}
	
