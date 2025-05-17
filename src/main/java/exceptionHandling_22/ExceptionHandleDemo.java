
package exceptionHandling_22;
import java.lang.ArithmeticException;

public class ExceptionHandleDemo
{

	public static void main(String[] args)
	{
		System.out.println("Start");
		
		//exception handling block
		
		try
		{
		  int c=10/0;
		  System.out.println("Division Result is "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something went wrong please check the exception "+e.getMessage());
			System.out.println("Seems you have entered zero please enter value > zero");
		}
		
		System.out.println("End");
		

	}

}
