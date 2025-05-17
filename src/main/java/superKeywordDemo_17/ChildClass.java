package superKeywordDemo_17;

public class ChildClass extends BaseClass
{

	int int_rate=10;
	
	public static void main(String[] args)
	{
		ChildClass obj1=new ChildClass();
		obj1.showMeIntRateFromPvtBank();
		
	}
	
	public void showMeIntRate()
	{
		
		System.out.println("I am in Child Class ");
		
	}
	public void showMeIntRateFromPvtBank()
	{
		super.showMeIntRate(); //super keyword is used to access the Parent super class variable and constructor
		
		System.out.println("Current Interest Rate from PVT Bank is "+ int_rate);
		
	}
	

}
