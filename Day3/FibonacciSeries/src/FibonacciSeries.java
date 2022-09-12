
public class FibonacciSeries {
	private int number;

	public FibonacciSeries(int number) {
		this.number = number;
	}
	
	public void getSeries()
	{
		int a = 0; 
		int b = 1;
		int c = 0;
		if(number >= 1)
		{
			System.out.print(a+" ");
		}
		if(number >= 2)
		{
			System.out.print(b+" ");
		}
		
		while(c < number)
		{
			c = a + b;
			System.out.print(c+ " ");
			a = b;
			b = c;
		}
	}
}
