package inheritanceDemo_13;

public class BankAccountMain {

	public static void main(String[] args)
	{
		System.out.println("Create a bank account object (A/C No BA1234) With initial balance of 500 rs");
		BankAccount BA1234=new BankAccount("BA1234",500);
		
		System.out.println("Deposit 1000 rs in BA1234 account");
		BA1234.deposit(1000);
		System.out.println("New account balance after depositing 1000 rs "+BA1234.getBalance());
		
		System.out.println("Withdraw 600 rs from account BA1234");
		BA1234.withdraw(600);
		System.out.println("New account balance after withdrawing 600 rs "+BA1234.getBalance());
		
		System.out.println("Create a new savings account object (A/C No SA1234) With initial balance of 450 rs");
		SavingsAccount SA1234=new SavingsAccount("SA1234",450);
		
		SA1234.withdraw(300);
		System.out.println(" account balance after withdrawing 300 rs "+SA1234.getBalance());
		
		System.out.println("Create a New Savings account object (A/C No SA1000) With initial balance of 300 rs");
		SavingsAccount SA1000=new SavingsAccount("SA1000",300);
		
		System.out.println("Try to withdraw $250 from SA1000!");
        SA1000.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance()); 
		
	}

}
