package exceptionHandling_22;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class ExceptionHandleDemo2
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
		//Multiple catch block can be added for  multiple type of exception classes
		catch(InputMismatchException e)
		{
			System.out.println("Hey please enter only integer values");
		}
		catch(Exception e) //exception class name & add parent class at end
		{
			System.out.println("OOps something went wrong");
		}
		finally
		{
			System.out.println("Finally Block");
			System.out.println("End");
		}
		
	}

}
