package thisKeywordDemo_16;

public class MyDrivers
{

	public static void main(String[] args)
	{
		MyDrivers obj1=new MyDrivers();
		obj1.display();
		
	}
	public MyDrivers()
	{
		this("JDBC");
		//constructor call chaining
		System.out.println("Loading My Drivers");
	}
	
	public MyDrivers(String name)
	{
		this(10);
		//Constructor Call chaining
		System.out.println("Loading My Drivers Name is "+name);
	}
	
	public MyDrivers(int count)
	{
		System.out.println("Loading My Drivers Count is "+count);
	}
	
	public void display()
	{
		System.out.println("I am in display method");
	}
}
