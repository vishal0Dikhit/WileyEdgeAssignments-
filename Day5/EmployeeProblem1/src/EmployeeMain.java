
public class EmployeeMain {

	public static void main(String[] args) {
		Employee []empArray = new Employee[5];
		
		empArray[0] = new Employee(101, "will gates", "hr", 25000);
		empArray[1] = new Employee(102, "sundar pichai", "technical", 35000);
		empArray[2] = new Employee(103, "Shivani Bhaskar", "support", 21000);
		empArray[3] = new Employee(104, "krunal pandya", "management", 40000);
		empArray[4] = new Employee(105, "elon musk ", "technical", 45000);
		
		for(int i = 0; i < empArray.length; i++)
		{
			System.out.println(empArray[i].calculateGrossSalary());
		}

		Employee.sortEmployees(empArray);
		
		Employee.searchEmployee(empArray, "technical");
	}

}
