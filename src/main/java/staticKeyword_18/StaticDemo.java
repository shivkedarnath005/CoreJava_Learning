package staticKeyword_18;

public class StaticDemo 
{
	//static code block will execute first before main method
	static
	{
		System.out.println("Static Block is executing");
	}
	public StaticDemo()
	{
		System.out.println("Constructor is Executing");	
	}
	public static void main(String[] args)
	{
		StaticDemo obj1=new StaticDemo();
		StaticDemo obj2=new StaticDemo();
	}

}
