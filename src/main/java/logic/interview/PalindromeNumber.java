package logic.interview;

import java.util.Scanner;

public class PalindromeNumber 
{

	public static void main(String[] args) 
	{
		int temp, n, rem, sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check ");
		n=sc.nextInt();
		temp=n;
		
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");

	}

}
