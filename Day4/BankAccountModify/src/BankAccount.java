
public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private double openingBalance;
	private double currentBalance;
	private static double totalBalance;
	private String accountType;
	
	public BankAccount(int accountId, String accountHolderName, double openingBalance, double currentBalance, String accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		this.currentBalance = currentBalance;
		this.accountType = accountType;
		checkOpeningBalance();
	}
	
	public void checkOpeningBalance()	{
		if(accountType.equals(AccountType.savings.toString()) && openingBalance < 500)
		{
			System.out.println("Minimum opening balance should be 500");
			return;
		}
		else if(accountType.equals(AccountType.current.toString()) && openingBalance < 1000)
		{
			System.err.println("Minimum opening balance should be 1000");
			return;
		}
		currentBalance += openingBalance;
		totalBalance += currentBalance + openingBalance;
		return;
	}
	
	public void depositeAmount(double amount){
		currentBalance += amount;
		totalBalance += amount;
	}
	
	public void withdrawAmount(double amount) {
		if(accountType.equals(AccountType.savings.toString()) && amount <= currentBalance-500 || accountType.equals(AccountType.current.toString()) && amount <= currentBalance-500)
		{
			System.out.println(amount+" withdraw from your account");
			totalBalance -= amount;
		}
		else
		{
			System.out.println(amount+" cash is not avaliable in your account");
		}
	}
	
	public void getCurrentBalance(){
		System.out.println("Current blance is : "+currentBalance);
	}
	
	public void diplayTotalBalance()
	{
		System.out.println("Total cash avaliable in bank is : "+totalBalance);
	}
}
