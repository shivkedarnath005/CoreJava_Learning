package conditionalStatement_6;
import java.util.Scanner;

public class IfElseAgeVoting
{

	public static void main(String[] args)
	{
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Value for a");
		a=sc.nextInt();
		
		if(a>18)
		{
			
			System.out.println("Eligible for Voting ");
			
		}
		
		else
		{
			
			System.out.println("Not Eligible for Voting ");
			
		}
		
	}

}
