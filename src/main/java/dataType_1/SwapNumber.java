package dataType_1;

public class SwapNumber 
{

	public static void main(String[] args)
	{
		int a,b,temp;
		a=15;
		b=27;
		
		// Print the values before swapping
		System.out.println("Before swapping a,b :"+a+" ,"+b);
		
		 // Perform the swap using a temporary variable
		temp=a;
		a=b;
		b=temp;
		
		// Print the values after swapping
		System.out.println("After swapping a,b :"+a+" ,"+b);
		

	}

}
