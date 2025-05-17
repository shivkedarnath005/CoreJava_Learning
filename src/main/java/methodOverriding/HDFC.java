package methodOverriding;

public class HDFC extends RBI 
{

	public static void main(String[] args)
	{
		RBI rate=new RBI();
		rate.homeloanIntRate();

	}
	public void homeloanIntRate()
	{
		
		System.out.println("HDFC Home Loan Interest Rate is 11 %");
	}

}
