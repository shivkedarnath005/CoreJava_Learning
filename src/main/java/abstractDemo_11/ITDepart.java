package abstractDemo_11;

public abstract class ITDepart implements Employee
{
    //Add abstract keyword in class

	public abstract void salary();
	// make abstract method by abstract keyword and make abstract class
	
	public void goodies()
	{
		System.out.println("Laptop");
		
	}

	public void work()
	{
		System.out.println("Automation Project");
		
	}

}
