
public class BankAccount{
	private int accountId;
	private String accountHolderName;
	private String accountType;
	
	public BankAccount(int accountId, String accountHolderName, String accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}
	public double calculateTotalInterest(double amount, int years)throws DepositeAmountException{
		double totalInterest;
		float rate;
		if(amount < 0)
		{
			throw new DepositeAmountException("Entered amount is negative ");
		}
		else if(accountType.equals(AccountType.savings.toString()))
		{
			rate = AccountType.savingsInterest();
			totalInterest = (amount * rate * years)/100;
		}
		else
		{
			rate = AccountType.currentInterest();
			totalInterest = (amount * rate * years)/100;
		}
		return totalInterest;
	}
}
