package constructorDemo_15;

public class BankMain 
{

	public static void main(String[] args)
	{
		Bank b1=new Bank(1000);
		b1.deposit(1000);
		b1.withdraw(500);
		b1.withdraw(2500);
		
		System.out.println("Current Balance = "+ b1.checkBalance());
		System.out.println("Current Balance = "+ b1.minimumBalance());
		
	}

}
