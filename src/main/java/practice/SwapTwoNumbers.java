package practice;

public class SwapTwoNumbers 
{

	public static void main(String[] args) 
	{

       swapNumbers(40,30);

	}
	
	public static void swapNumbers(int a, int b)
	{
		System.out.println("Value of a before swap - "+a+"Value of b before swap -"+b);
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("Value of a after swap - "+a+"Value of b after swap -"+b);
	}

}
