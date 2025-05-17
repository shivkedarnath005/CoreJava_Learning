package inheritanceDemo_13;

public class ChildClass3 extends BaseClass  //Use extends keyword for Class inheritance
{

	public static void main(String[] args)
	{
	   BaseClass obj1=new ChildClass3(); // Scenario 3 - Parent Reference & Child Object
	   
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
