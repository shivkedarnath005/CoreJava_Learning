package superKeywordDemo_17;

public class SubClass extends ParentClass
{

	public static void main(String[] args)
	{
		
		SubClass obj1=new SubClass("Amol Deokar");
		
	}
	
	public SubClass()
	{
		
		System.out.println("I am in Child Class Constructor ");
	}
	public SubClass(String name)
	{
		super(name);
		//super keyword will call the parent class constructor with parameter not default constructor
		
		System.out.println("I am in Child Class Constructor "+name);
	}

}
