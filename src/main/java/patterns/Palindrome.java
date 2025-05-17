package patterns;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		int rem, sum=0,temp,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for n");
		n=sc.nextInt();
		temp=n;
		
		 while(n>0)
		 {
			 rem=n%10;
			 sum=(sum*10)+rem;
			 n=n/10;
			 
		 }
		 
		 if(temp==sum)
		 System.out.println("Palindrome number");
		 else
		 System.out.println("Not Palindrome number");
		

	}

}
