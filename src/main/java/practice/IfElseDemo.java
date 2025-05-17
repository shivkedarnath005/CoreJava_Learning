package practice;
import java.util.Scanner;

public class IfElseDemo
{

	public static void main(String[] args) 
	{
		System.out.println("Enter three Numbers for Comparison");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value for a");
		int a=sc.nextInt();
		System.out.println("Enter a value for b");
		int b=sc.nextInt();
		System.out.println("Enter a value for c");
		int c=sc.nextInt();
		
		if((a>b)&&(a>c))
		{
			System.out.println("a is greater number");
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater number");
			}
			else
			{
				System.out.println("c is greater number");
			}
		}
	}

}
