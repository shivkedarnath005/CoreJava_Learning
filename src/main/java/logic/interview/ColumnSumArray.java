package logic.interview;

import java.util.Scanner;

public class ColumnSumArray 
{
	public static void main(String[] args) 
	{
		int[][] arr=new int[2][2];
		int i,j,sum=0;
		int columnIndex=0;
		
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
			sum=sum+arr[i][columnIndex];
		}
		System.out.println("Sum of Column Elements :"+sum);
		
	}

}
