package arrayDemo_3;

import java.util.Scanner;

public class ArraySumAverage 
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter an element");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of Array = "+sum);
		avg=sum/a.length;
		System.out.println("Array Average = "+avg);
		
	}

}
