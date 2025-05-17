package variablesDemo_4;

public class InstanceVariableNew 
{
	
	int roll;
	double marks;
	
	public InstanceVariableNew(int roll, double marks)
	{
		this.roll=roll;
		this.marks=marks;
		
	}
	
	public static void main(String[] args)
	{
		
		InstanceVariableNew obj1=new InstanceVariableNew(1,80.5);
		obj1.show();
		
		InstanceVariableNew obj2=new InstanceVariableNew(2,90.5);
		obj2.show();
		
		InstanceVariableNew obj3=new InstanceVariableNew(3,95.5);
		obj3.show();
		
	}
	
	public void show()
	{
		
		System.out.println("Roll Number "+roll+" "+"and Marks are "+marks);
	}
	
	
}
