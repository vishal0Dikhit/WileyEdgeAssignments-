
public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount1 = new BankAccount(101,"Jonhathan", 500, 10000, "savings");
		BankAccount bankAccount2 = new BankAccount(102,"Smith", 100, 5000, "current");
		BankAccount bankAccount3 = new BankAccount(103, "bheem", 1000, 13000, "current");
		
		bankAccount1.withdrawAmount(9000);
		bankAccount3.depositeAmount(4000);
		bankAccount3.getCurrentBalance();
		bankAccount2.diplayTotalBalance();
	}

}
