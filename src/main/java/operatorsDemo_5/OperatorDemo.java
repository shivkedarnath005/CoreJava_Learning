package operatorsDemo_5;

public class OperatorDemo
{

	public static void main(String[] args)
	{
		
		int a=35;
		int b=58;
		int c;
		boolean status;
		
		
		
		System.out.println((a++)+(++b));
		
		System.out.println((a--)+(--b));
		//post decrement after executing the statement
		
		System.out.println((++a)+(b--));
		
		System.out.println("Arithmatic Operators");
		System.out.println("Addition "+(a+b));
		
		
		int marks=70;
		boolean x;
		
		x=!(marks<80);
		System.out.println("Marks value "+x);
		
		

	}

}
