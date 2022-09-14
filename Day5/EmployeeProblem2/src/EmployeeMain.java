
public class EmployeeMain {

	public static void main(String[] args) {
			
		Employee e1 = new Employee(101, "sundar pichai", "hr", 25000);
		Employee e2 = new Employee(101, "sundar pichai", "technical", 25000);
		
		System.out.println(e1.equals(e2));
	}

}
