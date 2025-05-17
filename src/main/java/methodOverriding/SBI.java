package methodOverriding;

public class SBI extends RBI implements Loan 
{

	public static void main(String[] args)
	{
		SBI home=new SBI();
		home.homeloanIntRate();
		home.homeloan();
		home.carloan();

	}
	public void homeloanIntRate()
	{
		
		System.out.println("SBI Home Loan Interest Rate is 9 %");
	}

	public void homeloan() 
	{
		System.out.println("SBI Providing Home Loan");
	}

	public void carloan() 
	{
	
		System.out.println("SBI Providing Car Loan");
		
	}

}
