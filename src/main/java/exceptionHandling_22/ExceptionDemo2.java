package exceptionHandling_22;

public class ExceptionDemo2 
{

	public static void main(String[] args) 
	{
		try 
		{
			int a=10/0;
		}
		catch(NumberFormatException e)//multiple catch blocks
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)//catch block priority order
		{
			System.out.println(e);
		}
		catch(Exception e)//in multiple catch block parent Exception class will be at end
		{
			System.out.println(e);	
		}
		System.out.println("End Code");
		

	}

}
