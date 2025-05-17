package arrayDemo_3;

import java.util.Scanner;

public class ArraySumAvg
{

	public static void main(String[] args) 
	{
		int n,sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of elements in Array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter All the Elements in Array");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum= "+sum);
		avg=(float)sum/n;
		System.out.println("Average = "+avg);
		

	}

}
