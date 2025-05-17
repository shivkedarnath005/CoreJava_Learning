package inheritanceDemo_13;

public class ChildClass2 extends BaseClass  //Use extends keyword for Class inheritance
{

	public static void main(String[] args)
	{
	   ChildClass2 obj1=(ChildClass2) new BaseClass();
	// Scenario 4 - Child Reference & Parent Object Invalid Scenario
	   
	   obj1.add();
	   obj1.sub();
	   
	 
	}
	public void mul()

	{
		System.out.println("Hey I am in Child class and Multiplication is 2500");
		
	}
	public void div()

	{
		System.out.println("Hey I am in Child class and Division is 50");
		
	}

}
