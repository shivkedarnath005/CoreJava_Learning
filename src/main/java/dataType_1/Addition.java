package dataType_1;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args)
	{
		
		
		float a,b,c;
		
		Scanner sc=new Scanner(System.in);
		// Scanner Class Object sc is created and memory allocated
		
		System.out.println("Enter a value for a");
		a=sc.nextFloat(); // Object calling the method to input value and assign in a
		
		System.out.println("Enter a value for b");
		b=sc.nextFloat();
		
		c=a+b; // Arithmatic Addition Function
		
		System.out.println("Addition of Two Numbers= "+c);

	}

}
