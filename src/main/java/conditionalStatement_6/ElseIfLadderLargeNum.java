package conditionalStatement_6;
import java.util.Scanner;

public class ElseIfLadderLargeNum 
{

	public static void main(String[] args)
	{
		int a,b,c,d;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Value for a");
		a=sc.nextInt();
		
		System.out.println("Enter a Value for b");
		b=sc.nextInt();
		
		System.out.println("Enter a Value for c");
		c=sc.nextInt();
		
		System.out.println("Enter a Value for d");
		d=sc.nextInt();
		
		if((a>b)&&(a>c)&&(a>d))// Logical And && Operators used
		{
			
			System.out.println("a is greater");
			
			System.out.println("Difference Between a & b " +(a-b));
			
			System.out.println("Difference Between a & c " +(a-c));
			
			System.out.println("Difference Between a & d " +(a-d));
			
		}
		else if((b>c)&&(b>d)) //else-if Ladder same condition checking for all levels
			  {
				System.out.println("b is greater");
				
				System.out.println("Difference Between b & c " + (b-c));
				
				System.out.println("Difference Between b & d " + (b-d));
				
				System.out.println("Difference Between b & a " + (b-a));
				
			 }
			 else if(c>d)//relational operator
			      {
				  System.out.println("c is greater");
				
				  System.out.println("Difference Between c & d " + (c-d));
				
				  System.out.println("Difference Between c & b " + (c-b));
				
				  System.out.println("Difference Between c & a " + (c-a));
				
			      }
			      else 
			     {
				
				 System.out.println("d is greater");
				
				 System.out.println("Difference Between d & a " + (d-a));
				
				 System.out.println("Difference Between d & b " + (d-b));
				
				 System.out.println("Difference Between d & a " + (d-a));
				
				}	
	}

}
