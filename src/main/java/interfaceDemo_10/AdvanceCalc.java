package interfaceDemo_10;

public class AdvanceCalc implements Calc
{  //For implementing the interface class use the he implements keyword

	public static void main(String[] args)
	{
		AdvanceCalc obj1=new AdvanceCalc();
		obj1.add();
		obj1.sub();
		obj1.calculateSin();
		obj1.calculateCos();

	}
	
	public void calculateSin()
	{
		System.out.println("I am in Calc - Sin Method");
	}
	public void calculateCos()
	{
		System.out.println("I am in Calc - Cos Method");
	}

	
	public void add()
	{
		System.out.println("I am in Addition Method");	
		
	}

	public void sub() 
	{
		System.out.println("I am in Subtraction Method");
		
	}

}
