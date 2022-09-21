
public class Employee {
	private int empId;
	private String empName;
	private Address[] address;
	public Employee(int empId, String empName, Address []address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	public void displayDetail()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Parmanent Address Detail :");
		System.out.println("--------------------------------------");
		System.out.println("Flat Number: "+ address[0].getFlatNumber());
		System.out.println("Flat Name: "+ address[0].getFlatName());
		System.out.println("Road Name: "+ address[0].getRoadName());
		System.out.println("City Name: "+ address[0].getCityname());
		System.out.println("Employee Tamporary Address Detail :");
		System.out.println("--------------------------------------");
		System.out.println("Flat Number: "+ address[1].getFlatNumber());
		System.out.println("Flat Name: "+ address[1].getFlatName());
		System.out.println("Road Name: "+ address[1].getRoadName());
		System.out.println("City Name: "+ address[1].getCityname());
	}
}
