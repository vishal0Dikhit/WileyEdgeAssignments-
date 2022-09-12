
public class CheckDate {
	private int dd;
	private int mm;
	private int yy;
	
	public CheckDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void displayDate()
	{
		if(checkDate())
		{
			System.out.println("Given date is validate date");
		}
		else
		{
			System.out.println("Given date is not validate date");
		}
	}
	
	public boolean checkDate()
	{
		int year = yy;
		int count = 0;
		while(year != 0)
		{
			year /= 10;
			count++;
		}
		
		if(count == 4)
		{
			switch(mm)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dd >= 1 && dd <= 31)
					{
						return true;
					}
					break;
				case 2:
					if(yy % 4 == 0)
					{
						if(dd >= 1 && dd <= 29)
						{
							return true;
						}
					}
					else
					{
						if(dd >= 1 && dd <= 28)
						{
							return true;
						}
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(dd >= 1 && dd <= 30)
					{
						return true;
					}
					break;
					
				default:
					return false;
					
			}
		}
		return false;
	}
}
