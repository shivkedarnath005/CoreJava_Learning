package variablesDemo_4;

public class InstanceVariable 
{
	
	int roll=10;
	double marks=80.5;
	
	public static void main(String[] args)
	{
		
		InstanceVariable obj1=new InstanceVariable();
		obj1.show();
		
		InstanceVariable obj2=new InstanceVariable();
		obj2.show();
		
		InstanceVariable obj3=new InstanceVariable();
		obj3.show();
		
	}
	
	public void show()
	{
		
		System.out.println("Roll Number"+roll+" "+"and Marks are "+marks);
	}
	
	
}
