package logic.interview;

import java.util.Scanner;

public class PalindromeNumber1 
{

	public static void main(String[] args) 
	{
		int temp, n, rem, sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to Check : ");
		n=sc.nextInt();
		temp=n;
		
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println("The Number is Palindrome");
		else
			System.out.println("The Number is Not Palindrome");

	}

}
