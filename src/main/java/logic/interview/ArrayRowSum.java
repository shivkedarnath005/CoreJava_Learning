package logic.interview;

import java.util.Scanner;

public class ArrayRowSum 
{

	public static void main(String[] args) 
	{
		int arr[][]=new int[2][2];
		int sum,i,j;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entered Array Matrix - ");
		
		for(i=0;i<2;i++)  //Input Array
		{
			for(j=0;j<2;j++)
			{
				System.out.println("Enter Array Elements");
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<arr.length;i++) //sum logic array
		{
			sum=0;
			for(j=0;j<arr[i].length;j++) //row length arr[i].length
			{
				sum=sum+arr[i][j];
			}
			System.out.println("Sum of Row Elements :"+sum);
		}	
		
		

	}

}
