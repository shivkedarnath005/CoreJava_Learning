package classs.objects.methods_8;

import java.util.Scanner;

public class MathFormula 
{
	public void square()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for n");
		n=sc.nextInt();
		System.out.println("Square of Number n = "+(n*n));
	}
	public void cube()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for n");
		n=sc.nextInt();
		System.out.println("Cube of Number n = "+(n*n*n));
	}
	public void factorial() 
    { 
        int res = 1, i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value for n");
		n=sc.nextInt();
        for (i = 2; i <= n; i++) 
        { 
        	res =res * i;
        }
        System.out.println("Factorial of Number n = "+res);
        
    } 

}
