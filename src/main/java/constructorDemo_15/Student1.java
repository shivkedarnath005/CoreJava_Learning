package constructorDemo_15;

public class Student1
{
	int roll;
	String name;
	
	public void display()
	{
		System.out.println("Name= "+name);
		System.out.println("Roll Number = "+roll);
	}
	
	public Student1() //no return type like void
	{
		System.out.println("Constructor is Executing ");
	}
	
	public Student1(int roll, String name) //double parameterized constructor overloading
	{
		this.roll=roll;
		this.name=name;	
	}
	public Student1(int r) //single parameterized constructor overloading
	{
		roll=r;	
	}
		
}
