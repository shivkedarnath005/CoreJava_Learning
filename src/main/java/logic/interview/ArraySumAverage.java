package logic.interview;

import java.util.Scanner;

public class ArraySumAverage 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		int sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) //array elements input and sum logic
		{
			System.out.println("Enter Array Elements");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of Array Elements :"+sum);
		avg=sum/arr.length;
		System.out.println("Average of Array Elements : "+avg);
	}

}
