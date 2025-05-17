package exceptionHandling_22;

public class exceptionDemo 
{

	public static void main(String[] args)
	{
		System.out.println("Start Code Here");
		try
		{
		int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("End Code Here");
	
	}

}
