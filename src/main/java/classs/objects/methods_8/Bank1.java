package classs.objects.methods_8;

public class Bank1 
{
	int amount;
	public Bank1(int amount)
	{
		this.amount=amount; //instance varibale initialized by constructor pass value
	}
	
	public void deposit(int amount)
	{
		System.out.println("Going to Deposit");
		this.amount+=amount;
		System.out.println("Deposit Successfutl");	
	}
	
	public void withdraw(int amount)
	{
		this.amount-=1000;
		if(this.amount<amount)
		{
			System.out.println("Less Balance Please Deposit Minimum Balance");
		}
		else
		{
			System.out.println("Going to Withdraw");
		}
		amount+=1000;
	}
	
	public void balance()
	{
		System.out.println("Current Balance = "+this.amount);
	}

}
