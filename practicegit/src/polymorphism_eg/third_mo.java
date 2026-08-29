package polymorphism_eg;


		class Identity {
		   
		    void showInfo(String name, int id) {
		        System.out.println("Name: " + name + ", ID: " + id);
		    }

		   
		    void showInfo(int id, String name) {
		        System.out.println("ID: " + id + ", Name: " + name);
		    }
		}

		    public class third_mo {

		    	public static void main(String[] args) {
		        Identity obj = new Identity();
		        obj.showInfo("Piya", 101);
		        obj.showInfo(102, "Priya");
		    }
		}


