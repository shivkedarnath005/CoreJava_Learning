package exceptionHandling_22;

public class ExceptionDemo3 
{

	public static void main(String[] args) 
	{
		try
		{
			int a=10/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is Executing");
		}
		System.out.println("End Code");
		

	}

}
