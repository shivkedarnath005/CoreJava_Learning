package inheritanceDemo_13;

//BankAccount class inheritance too BankAccountMain class and Savings Account
//Hierarchical Inheritance

public class BankAccount 
{
	private String accountNumber;
	private double balance;
	
	//initialize the instance variable using the default parameterized constructor
	public BankAccount(String accountNumber, double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
	
	public void withdraw(double amount)
	{
		if(balance<=amount)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}		
	}
	
	public double getBalance()
	{
		return balance;
	}

}
