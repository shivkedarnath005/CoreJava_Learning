package inheritanceDemo_13;

public class SavingsAccount extends BankAccount
{

	public SavingsAccount(String accountNumber, double balance) 
	{
		super(accountNumber, balance);
		
	}
	public void withdraw(double amount)
	{
		if(getBalance()-amount<100)
		{
			System.out.println("Minimum balance 100 Rs required");
		}
		else
		{
			super.withdraw(amount);
		}
	}
	

}
