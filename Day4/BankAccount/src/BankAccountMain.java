
public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount1 = new BankAccount(101,"Jonhathan", 0, 10000);
		BankAccount bankAccount2 = new BankAccount(102,"Smith", 0, 5000);
		BankAccount bankAccount3 = new BankAccount(103, "bheem", 0, 13000);
		
		bankAccount1.withdrawAmount(3000);
		bankAccount3.depositeAmount(4000);
		bankAccount3.getCurrentBalance();
		bankAccount2.diplayTotalBalance();
	}

}
