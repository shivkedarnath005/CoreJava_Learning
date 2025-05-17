package classs.objects.methods_8;

import java.util.Scanner;

public class Bank1Main
{

	public static void main(String[] args)
	{
		Bank1 b=new Bank1(1000); //constructor value initialize in instance variable in constructor
		Scanner sc=new Scanner(System.in);
		char c;
		int amount;
		while(true)
		{
			System.out.println("Enter character for transaction");
			c=sc.next().charAt(0);
			switch(c)
			{
			   case'd':
				   System.out.println("Enter an amount for Deposit");
				   amount=sc.nextInt();
				   b.deposit(amount);
				   break;
			   case'w':
				   System.out.println("Enter an amount for Withdraw");
				   amount=sc.nextInt();
				   b.withdraw(amount);
				   break;
			   case'b':
			       b.balance();
			       break;
			   case'e':
				   System.out.println("Going To Exit");
				   System.exit(0);
			   default :
				   System.out.println("Sorry Wrong Code");
				   break;   
			}
		}
		
	}

}
