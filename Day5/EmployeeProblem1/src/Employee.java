
public class Employee {
	private int empId;
	private String empName;
	private String empDept;
	private double empBasicSalary;
	private double empGrossSalary;
	
	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}
	
	public double calculateGrossSalary()
	{
		double hra = empBasicSalary * 12/100;
		double da = empBasicSalary * 8/100;
		empGrossSalary = empBasicSalary + hra + da;
		return empGrossSalary;
	}
	
	public static void sortEmployees(Employee empArray[])
	{
		Employee temp;
		for(int i = 0; i < empArray.length; i++)
		{
			for(int j = i+1; j < empArray.length-1; j++)
			{
				if(empArray[i].empGrossSalary > empArray[j].empGrossSalary)
				{
					temp = empArray[i];
					empArray[i] = empArray[j];
					empArray[j] = temp;
				}
			}
		}
		System.out.println("After sorting the employee object by gross salary in asending order");
		for(int i = 0; i < empArray.length; i++)
		{
			System.out.println("Employee name : "+empArray[i].empName+ "   Employee Gross salary : "+empArray[i].empGrossSalary);
		}
	}
	
	public static void searchEmployee(Employee empArray[], String department)
	{
		int count = 0;
		boolean flag = false;
		for(int i = 0; i < empArray.length; i++)
		{
			if(empArray[i].empDept == department)
			{
				count++;
				flag = true;
			}
		}
		
		if(flag)
		{
			System.out.println("Total employee in given department is : " +count);
		}
		else
		{
			System.out.println("There is not" +department+" department");
		}
	}
}
