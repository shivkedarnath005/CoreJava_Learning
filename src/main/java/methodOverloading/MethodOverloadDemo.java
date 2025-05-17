package methodOverloading;

public class MethodOverloadDemo 
{
	
	public void add(int a, int b)//type parameters
	{
		System.out.println("Adding two integers "+(a+b));
	}
	public void add(float a, int b) //Order of parameters
	{
		System.out.println("Adding 1 float and 1 integer "+(a+b));
	}
	public void add(int a, float b)//order of parameters
	{
		System.out.println("Adding 1 integer and 1 float "+(a+b));
	}
	public void add(char c, char b)//type of parameters
	{
		System.out.println("Adding two chars "+c+b);
	}
	public void add(int a, int b, int c)//number of parameters
	{
		System.out.println("Adding three integers "+(a+b+c));
	}
	public void add(String a, String b )//method name is same
	{
		System.out.println("Addition of two strings "+a+b);
	}
	
	public static void main(String[] args)
	{
		MethodOverloadDemo a=new MethodOverloadDemo();
		a.add(20, 30);
		a.add(10f, 40);
		a.add(30, 40f);
		a.add('a','b');
		a.add("Hello", "Java");
		a.add(40, 30,30);
		
	}

}
