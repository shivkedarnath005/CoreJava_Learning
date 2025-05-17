package logic.interview;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) 
	{
		int arr[][]=new int [2][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Enter Two Dimensional Array Elements");
				arr[i][j]=sc.nextInt();			
			}
		}
		System.out.println("Entered Array Matrix -");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
						
			}
			System.out.println();
		}
		
		
	}

}
