
public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private double openingBalance = 0;
	private double currentBalance;
	private static double totalBalance;
	
	public BankAccount(int accountId, String accountHolderName, double openingBalance, double currentBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		this.currentBalance = currentBalance;
		totalBalance += currentBalance;
	}
	
	public void depositeAmount(double amount){
		currentBalance += amount;
		totalBalance += amount;
	}
	
	public void withdrawAmount(double amount){
		if(amount <= currentBalance)
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
