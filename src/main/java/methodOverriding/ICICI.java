package methodOverriding;

public class ICICI extends RBI implements Loan
{

	public static void main(String[] args)
	{
		ICICI obj=new ICICI();
		obj.homeloanIntRate();
		obj.homeloan();
		obj.carloan();
		

	}
	public void homeloanIntRate()
	{
		
		System.out.println("ICICI Home Loan Interest Rate is 10 %");
	}
	
	public void homeloan() 
	{
		System.out.println("ICICI Providing Home Loan");
	}
	
	public void carloan() 
	{
	
		System.out.println("ICICI Providing Car Loan");
		
	}

}
