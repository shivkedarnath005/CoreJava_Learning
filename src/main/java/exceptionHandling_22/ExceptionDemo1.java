package exceptionHandling_22;

public class ExceptionDemo1
{

	public static void main(String[] args) 
	{
		System.out.println("Start Here");
		int i=10/1;//arithmetic exception
		System.out.println("Statement 1 is Executing");
		
		int a[]=new int[5];
		a[4]=10;//array index out of bounds
		System.out.println("Statement 2 is Executing");
		
		String s="null"; //null poniter exception
		System.out.println(s.length());
		System.out.println("Statement 3 is Executing");
		
		String s1="kbc"; //string index out of bounds
		System.out.println(s1.charAt(2));
		System.out.println("Statement 4 is Executing");
		
		String s2="1234"; //number format exception
		int b=Integer.parseInt(s2);
		System.out.println("Statement 5 is Executing");
		System.out.println("End Code");
		
	}

}
