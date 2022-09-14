
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

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee)
		{
			Employee employee = (Employee) obj;
			return this.empId == employee.empId && this.empName.equals(employee.empName);
		}
		return false;
	}
	
	
}
