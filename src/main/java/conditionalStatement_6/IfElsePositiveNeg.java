package conditionalStatement_6;
import java.util.Scanner;

public class IfElsePositiveNeg 
{

	public static void main(String[] args) 
	{

		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Value for a");
		a=sc.nextInt();
		
		if(a>0) //if-else & else if ladder
		{	
			System.out.println("Number is Positive");	
		}
		
		else if(a<0)
		     {	
			    System.out.println("Number is Negative ");	
		     }
		     else
		     {
		    	 System.out.println("Number is Zero");
		     }
		
	}
}
