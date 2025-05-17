package constructorDemo_15;

public class Bank
{
	private double bal=0;
	
	public Bank(double initial_bal)
	{
		if(initial_bal>=1000)
		{
			this.bal=initial_bal;
		}
		else
		{
			this.bal=1000;
			System.out.println("Initial Balance must be greater than 1000 Rs");
		}
	}
	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			bal=bal+amount;
			System.out.println("Deposited = "+amount);
		}
		else
		{
			System.out.println("Deposit Amount must be greater than 0");
		}	
	}
	
	public void withdraw(double amount)
	{
		if(amount>0)
		{
			if(amount<=bal)
			{
				bal=bal-amount;
			    System.out.println("Withdraw Amount = "+amount);
			}
			else
				System.out.println("Insufficient Balance - Wthdrawal Failed");
		}
		else
			System.out.println("Withdrawal amount must be greater than 0");
	}
	
	public double checkBalance()
	{
		return bal;
		
	}
	
	public double minimumBalance()
	{
		this.bal=1000;
		return bal;
	}

}
