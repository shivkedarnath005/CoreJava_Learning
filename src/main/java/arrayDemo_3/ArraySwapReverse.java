package arrayDemo_3;

import java.util.Scanner;

public class ArraySwapReverse 
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of elements in Array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter All the Elements in Array");
		int i,j;
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int b[]=new int[n];
		for(i=0;i<a.length;i++) //we can use another for loop for b array
		{
			for(j=n;j>b.length;j--)
			{
			  b[j]=a[i];
			}
			
		}
		
		for(i=0;i<b.length;i++)
		{
			System.out.print(" "+b[i]);
		}
		
	}

}
