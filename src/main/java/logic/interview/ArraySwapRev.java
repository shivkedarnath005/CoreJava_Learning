package logic.interview;

import java.util.Scanner;

public class ArraySwapRev 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of elements in Array");
		n=sc.nextInt();
		int [] a=new int[n];
		int [] b=new int[n];
		
		int i,j;
		System.out.println("Enter All elements in Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=n;j>b.length;j--)
			{
				//b[j]=a[i];
				a[i] = a[i] + b[j];
			    b[j] = a[i] - b[j]; 
			    a[i] = a[i] - b[j];
			    
			}
		}
		
		for(i=0;i<b.length;i++)
		{
			System.out.println(" "+b[i]);
		}

	}

}
