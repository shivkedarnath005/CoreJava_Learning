package methodOverriding;

public class ChildClass extends ParentClass 
{

	public static void main(String[] args)
	{
		ChildClass obj1= new ChildClass();
		
		obj1.display();
		
		ParentClass obj2= new ParentClass();
		obj2.display();
		
		ParentClass obj3= new ChildClass();
		obj3.display();
		
	}
	

	public void display()
	{
		
		System.out.println("I am in Child Class Display Method");
		
	}
	public void display(String name)
	{
		
		System.out.println("I am in Child Class Display Method");
		
	}

}
