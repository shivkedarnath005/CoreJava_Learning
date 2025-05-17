package interfaceDemo_10;

public class AdvanceCalc1 implements Calc
{  //For implementing the interface class use the he implements keyword

	public static void main(String[] args)
	{
		Calc obj1=new AdvanceCalc1();
		//You can not create object of an interface it has abstract method
		//Calc obj1=new Calc();
		//AdvanceCal1 obj1=new Calc();
		obj1.add();
		obj1.sub();
		

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
