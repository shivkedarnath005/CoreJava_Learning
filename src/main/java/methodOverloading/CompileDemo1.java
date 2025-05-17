package methodOverloading;

public class CompileDemo1 
{
	//Method Overloading with Compile Time Binding

	public static void main(String[] args) 
	{
		
		CompileDemo1 obj1 = new CompileDemo1();
		
		obj1.add(45,45);
		
		obj1.add(25,50,75);
		
		obj1.add(25,50.5);
		
		obj1.add(55.5,20);
		
		obj1.add(40.5,35.5);
		
	}
	
	public void add(double a,int b)
	{
		//Order of Arguments
		double sum=a+b;
		
		System.out.println("The Sum of Number is "+sum);
		
	}
	
	public void add(int a, double b)
	{
		//Type of Arguments
		double sum=a+b;
		
		System.out.println("The Sum of Number is "+sum);
		
	}
	
	public void add(double a, double b)
	{
		double c=a+b;
		
		System.out.println("The Sum of Number is "+c);
	}
	
	
	public void add(int a, int b) //Same add method overloaded with 2 & 3 arguments
	{
		int c=a+b;
		
		System.out.println("The Sum of Number is "+c);
	}
	
	public void add(int a, int b, int d)
	{
		//Number of Arguments
		int c=a+b+d;
		
		System.out.println("The Sum of Number is "+c);
	}

}
