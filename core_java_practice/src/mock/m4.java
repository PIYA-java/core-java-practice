package mock;

import java.util.ArrayList;
import java.util.List;

public class m4 {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		 list.add(new Employee("abc",2,"HR"));
		 list.add(new Employee("pqr",2,"Account"));
		 list.add(new Employee("stu",3,"HR"));
		 list.add(new Employee("xyz",4,"Manager"));
		 list.stream()
		 .filter((i)->i.department.equals("HR"))
		 .forEach((i)->{System.out.println(i);});
		
			}

}
class Employee
{
	String name;
	int id;
	String department;
	public Employee(String name, int id,String department) {
		super();
		this.name = name;
		this.id = id;
		this.department= department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + "]";
	}
	
	
	
}
