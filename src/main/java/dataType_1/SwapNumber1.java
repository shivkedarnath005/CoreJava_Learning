package dataType_1;

public class SwapNumber1 
{

	public static void main(String[] args)
	{
		int a,b,temp;
		a=15;
		b=27;
		
		// Print the values before swapping
		System.out.println("Before swapping a,b :"+a+" ,"+b);
		
		a=a+b; // Add a and b and store the result in a
		b=a-b; // Subtract the original b from the new a and store the result in b
		a=a-b; // Subtract the new b from the updated a and store the result in a
		
		// Print the values after swapping
		System.out.println("After swapping a,b :"+a+" ,"+b);
		

	}

}
