package arrayDemo_3;

import java.util.Scanner;

public class arrayRowElementAddition 
{

	public static void main(String[] args)
	{
		int a[][]=new int [3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entered Matrix a = ");
		
		for(i=0;i<3;i++) //rows outer loop
		{
			for(j=0;j<3;j++) //columns inner loop
			{
				System.out.println("Enter Array Element ");
				a[i][j]=sc.nextInt();	
			}
		}
		
		for(i=0;i<a.length;i++) //rows outer loop
		{
			int sum=0;
			for(j=0;j<a[i].length;j++) //columns inner loop
			{
				sum=sum+a[i][j];	
			}
			System.out.println("Sum of Row "+(i+1)+":"+sum);
		}
	}
}
