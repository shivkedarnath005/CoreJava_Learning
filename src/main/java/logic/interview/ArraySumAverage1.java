package logic.interview;

import java.util.Scanner;

public class ArraySumAverage1 {

	public static void main(String[] args) 
	{
		int[] arr=new int[5];
		int i,sum=0;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Enter Array Elements :");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of Array Elements :"+sum);
		avg=sum/arr.length;
		System.out.println("Average of Array Elements :"+avg);

	}

}
