package abstractDemo_11;

public abstract class AbstractDemo 
{
	int a=90;
	
	public AbstractDemo()//Abstract class constructor
	{
		System.out.println("Constructor is Executing");
	}
	public void get() //Concrete method
	{
		a=80;
		System.out.println("This is the get method from the abstract class");
	}
	public abstract void show();//abstract method
	

}
