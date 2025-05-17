package logic.interview;

import java.util.Scanner;

public class ArrayRowSum1 
{

	public static void main(String[] args) 
	{
		int[][] arr=new int[2][2];
		int i,j,sum;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Array Matrix Input is:");
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("Enter Array Elements");
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<arr.length;i++)
		{
			sum=0;
			for(j=0;j<arr[i].length;j++)
			{
				
				sum+=arr[i][j];
			}
			System.out.println("Sum of Row Elements :"+sum);
		}
		
	}

}
