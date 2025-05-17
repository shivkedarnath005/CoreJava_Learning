package inheritanceDemo_13;

public class ChildClass extends BaseClass  //Use extends keyword for Class inheritance
{

	public static void main(String[] args)
	{
	   ChildClass obj1=new ChildClass(); // Scenario 1 - Child Reference & Child Object
	   
	   obj1.add();
	   obj1.sub();
	   obj1.mul();
	   obj1.div();
	   

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
