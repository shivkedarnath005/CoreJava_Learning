package conditionalStatement_6;
import java.util.Scanner;

public class IfElseOddEven 
{

	public static void main(String[] args)
	{
		
        int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Value for a");
		
		a=sc.nextInt();
		
		if(a%2==0) //if-else conditional statement is used
		{
			System.out.println("Number is Even ");	
		}
		
		else
		{	
			System.out.println("Number is Odd ");	
		}
	
	}

}
