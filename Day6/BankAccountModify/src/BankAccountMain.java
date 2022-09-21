
public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount1 = new BankAccount(101,"Jonhathan","savings");
		BankAccount bankAccount2 = new BankAccount(102,"Smith","current");
		BankAccount bankAccount3 = new BankAccount(103,"bheem","current");
		double interest = 0;
		try {
			interest = bankAccount1.calculateTotalInterest(20000,2);
			System.out.println("Total interest for entered years is : "+interest);
			interest = bankAccount2.calculateTotalInterest(200000,7);
			System.out.println("Total interest for entered years is : "+interest);
			interest = bankAccount3.calculateTotalInterest(-50000,5);
			System.out.println("Total interest for entered years is : "+interest);
		}
		catch(DepositeAmountException d)
		{
			System.out.println(d);
		}
	}
}
