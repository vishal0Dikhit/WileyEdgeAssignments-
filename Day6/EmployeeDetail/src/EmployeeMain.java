
public class EmployeeMain {

	public static void main(String[] args) {
		Address address[] = new Address[2];
		address[0] = new Address(45,"Thakur vila","Kalani nagar","Indore");
		address[1] = new Address(20,"Thakur vila","Vijay nagar","Mahu");
		Employee emp1 = new Employee(101, "will gates",address);
		emp1.displayDetail();
	}

}
