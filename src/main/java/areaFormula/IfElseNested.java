package areaFormula;
import java.util.Scanner;

public class IfElseNested 
{
	public static void main(String[] args)
	{
        float mark;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Value for mark");
		mark=sc.nextFloat();
		
		if((mark<=0) && (mark>100))
		{
			System.out.println("Marks Input Invalid");
		}
		else //Nested If-else
		{
			if((mark>80) && (mark<=100))//Logical & Relational operators
			{
				
				System.out.println("Marks Grade is A+");
				
			}
			else if((mark>60) && (mark<=80)) //else-if ladder
			     {
				   System.out.println("Marks Grade is A");
				
			     }
			     else if((mark>45) && (mark<=60))
			          {
				        System.out.println("Marks Grade is B");
			          }
			          else
			          {
				        System.out.println("Marks Grade is Fail");
			          }
		}	
	}

}
