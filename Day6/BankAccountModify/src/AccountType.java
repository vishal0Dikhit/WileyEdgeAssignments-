
public enum AccountType {
	savings, current;
	
	public static float savingsInterest()
	{
		return (float) 7.9;
	}
	
	public static float currentInterest()
	{
		return (float) 6.5;
	}
}
